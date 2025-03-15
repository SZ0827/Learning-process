import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

class BookMannagementSystem {
    private List<User> users = new ArrayList<>();
    private List<Book> books = new ArrayList<>();
    //创建一个可重入锁ReentrantLock实例，同一个线程可以多次获取同一把锁，而不会造成死锁
    private Lock lock = new ReentrantLock();
    private static final String BOOKS_FILE = "StudengtManagementSystem\\books.txt";
    private static final String USERS_FILE = "E:\\Algorithm Practice\\day11\\StudengtManagementSystem\\users.txt";
    private static final String LOG_FILE = "StudengtManagementSystem\\log.txt";
    private User currentUser = null;

    public BookMannagementSystem() {
        laodBooks();
        loadUsers();

    }
    public void register(String username,String password,boolean isAdmin){
        users.add(new User(username,password,isAdmin));
        saveUsers();
        log("用户注册"+username);

    }
    private void laodBooks()  {
        try(BufferedReader reader=new BufferedReader(new FileReader(BOOKS_FILE))){
            books=reader.lines().filter(line->!line.isEmpty())
                    .map(line->{
                String[] parts=line.split(",");
                if(parts.length==3){
                    Book book= new Book(parts[0],parts[1]);
                    book.isBorrowed=Boolean.parseBoolean(parts[2]);
                    return book;
                }else{
                    System.out.println("无效行: " + line);
                    return null;
                }
            }).filter(Objects::nonNull)
                    .collect(Collectors.toList());
        }catch (IOException e){
            System.out.println("无书籍数据");
        }

    }
    //读取用户数据
    private void loadUsers() {
        try(BufferedReader reader=new BufferedReader(new FileReader(USERS_FILE))){
            users=reader.lines().filter(line->!line.isEmpty())
                    .map(line->{
                        String[] parts=line.split(",");
                        if(parts.length==3){
                            User user= new User(parts[0],parts[1],Boolean.parseBoolean(parts[2]));
                            return user;
                        }else{
                            System.out.println("无效行: " + line); // 记录无效行
                            return null; // 返回 null，后续过滤掉
                        }
                    }).filter(Objects::nonNull)
                    .collect(Collectors.toList());
        }catch (IOException e){
            System.out.println("无用户数据");
        }
    }
    public boolean login(String username,String password){
        for(User user:users){
            if(user.getName().equals(username)&&user.password.equals(password)){
                currentUser=user;
                log("用户登录"+username);
                System.out.println("登录成功");
                return true;
            }
        }
        System.out.println("登录失败");
        return false;
    }
    //添加书籍
    public void addBook(String title,String author){
        if(!currentUser.isAdmin){
            System.out.println("权限不足");
            return;
        }
        books.add(new Book(title,author));
        saveBooks();
        log("添加书籍"+title);
    }
    public void addUser(String username,String password){
        if(!currentUser.isAdmin){
            System.out.println("权限不足");
            return;
        }
        users.add(new User(username,password,false));
        saveUsers();
        log("添加用户"+username);
    }
    //查看所有书籍
    public void listBooks(){
        books.forEach(book->System.out.println(book.title+"-"+book.author+(book.isBorrowed?"[已借出]":"可借")));
    }
    //借书
    public void borrowBook(String title){
        lock.lock();
        try {
            for(Book book:books){
                if(book.title.equals(title)&&!book.isBorrowed){
                    book.isBorrowed=true;
                    saveBooks();
                    log("借书"+title);
                    System.out.println("借阅成功"+title);
                    return ;
                }
            }
            System.out.println("借阅失败，书籍不存在或已被借出");
        } finally {
            lock.unlock();
        }
    }
    //归还图书
    public void returnBook(String title){
        for(Book book:books){
            if(book.title.equals(title)&&book.isBorrowed){
                book.isBorrowed=false;
                saveBooks();
                log("还书"+title);
                System.out.println("还书成功"+title);
                return ;
            }
        }
        System.out.println("还书失败，书籍不存在或未借出");
    }
    //读取书籍数据

    //保存书籍书籍
    private void saveBooks(){
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(BOOKS_FILE))){
            for(Book book:books){
                writer.write(book.title+","+book.author+","+book.isBorrowed+"\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //保存用户数据
    private void saveUsers(){
        try(PrintWriter writer=new PrintWriter(new FileWriter(USERS_FILE))){
            for(User user:users){
                writer.println(user.getName()+","+user.password+","+user.isAdmin+"\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //记录日志
    private  void log(String message){
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(LOG_FILE,true))){
            writer.write(message+"\n");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}


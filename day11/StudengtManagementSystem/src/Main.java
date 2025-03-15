
    public class Main {
    public static void main(String[] args) {

        BookMannagementSystem system=new BookMannagementSystem();
        system.login("admin", "123");

        system.addBook("Java宝典", "Bruce Eckel");
        system.addUser("zzf", "Bruce Eckel");
        system.addBook("Spring框架", "Craig Walls");
        system.listBooks();
        system.borrowBook("Java 编程思想");
        system.returnBook("Java 编程思想");

    }
}
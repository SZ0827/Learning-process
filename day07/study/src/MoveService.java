import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoveService {
    private static List<Move> movices=new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public  void start(){
        while (true) {
            System.out.println("电影操作系统");
            System.out.println("1.上架");
            System.out.println("2。下架");
            System.out.println("3.查询");
            System.out.println("4.封杀");
            System.out.println("5.退出");
            System.out.println("6.展示全部电影");
            System.out.println("请输入你要进行的操作");
            String input = scanner.next();
            switch(input){
                    case"1":
                        addMove();
                    break;
                    case"2":
                        removeMove();
                    break;
                    case"3":
                        seachMove();
                    break;
                    case"4":
                        deleteMove();
                    break;
                    case"5":
                    return;
                    case"6":
                    showMove();
                    break;
                    default:
                    System.out.println("输入错误");
                    break;
            }
        }

    }

    private void showMove() {
        for (int i = 0; i < movices.size(); i++) {
            System.out.println(movices.get(i));
        }
    }

    private void deleteMove() {
        System.out.println("请输入要封杀的电影名");
        String name = scanner.next();
        for (int i = 0; i < movices.size(); i++) {
            if(movices.get(i).getActor().contains(name)){
                movices.remove(i);
                System.out.println("封杀成功");
                i--;
            }else{
                System.out.println("没有此电影");
            }
        }
        showMove();
    }

    private void seachMove() {
        System.out.println("请输入要查询的电影名");
        String name = scanner.next();
        for (int i = 0; i < movices.size(); i++) {
            if(movices.get(i).getName().equals(name)){
                System.out.println(movices.get(i));
                return;
            }else{
                System.out.println("没有此电影");
            }
        }
    }

    private void removeMove() {
        System.out.println("请输入要删除的电影名");
        String name = scanner.next();
        for (int i = 0; i < movices.size(); i++) {
            if(movices.get(i).getName().equals(name)){
                movices.remove(i);
                System.out.println("删除成功");
                return;
            }
        }
        showMove();
    }

    private void addMove() {
        System.out.println("请输入电影名");
        String name = scanner.next();
        System.out.println("请输入电影评分");
        double score = scanner.nextDouble();
        System.out.println("请输入演员");
        String actor = scanner.next();
        System.out.println("请输入价格");
        double price = scanner.nextDouble();
        movices.add(new Move(name,score,actor,price));
        showMove();
    }
}

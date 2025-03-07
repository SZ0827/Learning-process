import java.util.Scanner;

public class MoveOprator {
    private MoveInfo[] moves;

    public MoveOprator( MoveInfo[] moves){

        this.moves = moves;
    }
    public void printAllMove(){
     for(int i=0;i< moves.length;i++){
         MoveInfo m = moves[i];
         System.out.println(m.toString());
     }
    }
    public void searchById(){
        System.out.println("请输入要查询的id");
        Scanner scanner=new Scanner(System.in);
        int id =scanner.nextInt();
        for(int i=0;i< moves.length;i++){
            MoveInfo m = moves[i];
            if(m.getId()==id){
                System.out.println(m.getId()+" "+m.getName()+" "+m.getPrice()+" "+m.getActor());
                return;
            }
            }System.out.println("没有找到该id");
        }

    }


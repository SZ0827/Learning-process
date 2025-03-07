public class Move {
    public static void main(String[] args) {
       MoveInfo[] move=new MoveInfo[6];
       move[0]=new MoveInfo(1,"林家的龙女仆",3,"小林家的龙女仆");
       move[1]=new MoveInfo(2,"家的龙女仆",55,"小林家的龙女");
       move[2]=new MoveInfo(3,"的龙女仆",7,"小林家的龙");
       move[3]=new MoveInfo(4,"龙女仆",0.0,"小林家的");
       move[4]=new MoveInfo(5,"女仆",9,"小林家");
       move[5]=new MoveInfo(6,"仆",2,"小林");
       MoveOprator mo=new MoveOprator(move);
       mo.printAllMove();
       mo.searchById();
    }

}

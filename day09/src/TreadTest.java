import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TreadTest {
    public static void main(String[] args) {
        List<Integer> redPacket=getRedPacket();
        //创建100个线程
        for (int i = 1; i <=100 ; i++) {
             new PeopelGetRedPacket(redPacket,"人"+i).start();
        }

    }


     //生成200个红包
    public static List<Integer> getRedPacket(){
        Random r=new Random();
        List<Integer> redPacket=new ArrayList<>();
        for (int i = 1; i <=160 ; i++) {
            redPacket.add(r.nextInt(30)+1);
        }
        for (int i = 1; i <40 ; i++) {
            redPacket.add(r.nextInt(100)+1);
        }
        return redPacket;
    }
}

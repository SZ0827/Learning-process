import java.util.List;

public class PeopelGetRedPacket extends Thread {
    private List<Integer> redPacket;
    //有参构造器
    public PeopelGetRedPacket(List<Integer> redPacket, String name) {
        super(name);
        this.redPacket = redPacket;
    }

    @Override
    public void run(){
        //获取线程当前名字
        String name=Thread.currentThread().getName();
        while (true) {

            synchronized (redPacket){
                if(redPacket.size()==0){
                break;
            }
                int index=(int)(Math.random()*redPacket.size());
                Integer money = redPacket.remove(index);
                System.out.println(name+"抢到了"+money+"元");
                if(redPacket.size()==0){
                    System.out.println("活动结束");
                    break;
                }

            }
        }

    }
}

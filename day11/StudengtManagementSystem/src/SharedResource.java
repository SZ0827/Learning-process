public class SharedResource {
    private boolean availeble=false;
    public synchronized  void produce(){
        while(availeble){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("生产数据");
        availeble=true;
        notify();
    }
    public synchronized void consum(){
        while(!availeble){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("消费数据");
        availeble=false;
        notify();
    }
}

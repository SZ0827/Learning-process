import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask<>(new MyCallable());
        Thread t1 = new Thread(task);
        t1.start();
        System.out.println(task.get());
    }
    static class MyCallable implements Callable<Integer> {
        public Integer call() throws Exception{
            int sum=0;
            for(int i=1;i<=10;i++){
                sum+=i;
            }
            return sum;
        }
    }
}

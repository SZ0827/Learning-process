package Java.com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class DataDemo {
    public static void main(String[] args) throws InterruptedException {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        Collection<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        for(String name:list){
            System.out.print(name+"");
        }
        System.out.println("----------------");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"");
        }
        System.out.println("----------------");
        list.forEach(name->{
            System.out.print(name+"");
        });
        System.out.println("----------------");

        list.forEach(System.out::print);
        Box<Integer> box = new Box<>();
        Box<String> box2 = new Box<>();
        System.out.println(box.getClass());
        System.out.println(box.getClass()==box2.getClass());
        try {
            int result=10/1;
            System.out.println(result);
            return ;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("是否异常都执行");
        }
        Thread.sleep(1000);
    }

}
class Box<T>{
    private T t;
    public void set(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
}
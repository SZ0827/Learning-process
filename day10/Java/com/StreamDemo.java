package Java.com;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("张三","李四","王五");
        for(String name:names){
            if(name.startsWith("王")){
                System.out.println(name);
            }
        }
        names.stream()
                .filter(name->name.startsWith("李"))
                .forEach(System.out::println);
    }
}

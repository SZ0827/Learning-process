import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        String[] name={"Tom","Bobi","caocao","baby","曹操"};
        Arrays.sort(name,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        //lambda表达式
        Arrays.sort(name,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(name));

    }
}

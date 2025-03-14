package Java.com;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class CustomTreeSet {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        for(Map.Entry<String, String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}

import lombok.val;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        calc();

    }
    public static void calc(){
        List<String> location = new ArrayList<>();
        String[] name= {"北京","上海","广州","深圳"};
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(name.length);
            location.add(name[index]);
        }
        System.out.println(location);
        Map<String,Integer> map=new HashMap<>();
        for (String loc : location) {
            if(map.containsKey(loc)){
                map.put(loc,map.get(loc)+1);
            }else{
                map.put(loc,1);
            }

        }
        map.forEach((k,v)->{
            System.out.println((k + "挑选人数：" + v));
        });
    }

}

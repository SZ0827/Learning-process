import java.util.HashMap;
import java.util.Map;

public class WordPatten {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat dog"));
        System.out.println(wordPattern("abba","dog cat cat fish"));
        System.out.println(wordPattern("aaaa","dog cat cat dog"));
        System.out.println(wordPattern("abc","dog cat  dog"));




    }
    //给定一个规律pattern和一个字符串s，判断s是否遵循相同的规律。
    public static boolean wordPattern(String pattern, String s){
        //定义两个map，一个map包含pattern的字符和s的字符，一个map包含s的字符和pattern的字符
        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();
        //将字符串s按照空格分割成数组
        String[] arr = s.split(" ");
        //得到pattern长度
        int len = pattern.length();
        //判断pattern和s的长度是否相等
        if(len!=arr.length){
            return false;
        }
        for(int i=0;i<len;i++){
            //判断map1中是否有pattern[i]对应的值，如果有，判断map2中是否有arr[i]对应的值，如果有，判断两个值是否相等，不相等返回false
            if(map1.containsKey(pattern.charAt(i))){
                if(!map2.containsKey(arr[i])||!map1.get(pattern.charAt(i)).equals(arr[i])||!map2.get(arr[i]).equals(pattern.charAt(i))) {
                    return false;
                }
            }else if(map2.containsKey(arr[i])){
                    return false;
                }
            map1.put(pattern.charAt(i),arr[i]);
            map2.put(arr[i],pattern.charAt(i));
        }
        return true;
    }
}

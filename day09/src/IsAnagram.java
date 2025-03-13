import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("rat","car"));

    }
    public static boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()){
           return false;
       }
       char[] s1=s.toCharArray();
       char[] t1=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1,t1);
   }
    public static boolean isAnagram2(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] count=new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        for(char c:t.toCharArray()){
            count[c-'a']--;
            if(count[c-'a']<0){
                return false;
            }
        }
        return true;
    }
    public static boolean isAnagram3(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
        }
        for(int count:map.values()){
            if(count!=0) return false;
        }
        return true;
    }

}

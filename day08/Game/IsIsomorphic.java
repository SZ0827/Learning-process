package Game;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
    public static void main(String[] args) {
        IsIsomorphic isIsomorphic = new IsIsomorphic();
        System.out.println(isIsomorphic.isIsomorphic("eag","add"));

    }
    public boolean isIsomorphic(String s, String t){
        Map<Character, Character> s1=new HashMap<>();
        Map<Character, Character> t1=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if((s1.containsKey(a)&&s1.get(a)!=b)||(t1.containsKey(b)&&t1.get(b)!=a)){
                return false;
            }
            s1.put(a,b);
            t1.put(b,a);
        }
        return true;


    }

}

package Game;

public class CanConstruct {
    public static void main(String[] args) {
        CanConstruct canConstruct = new CanConstruct();
        System.out.println(canConstruct.canConstruct("aa", "aab"));

    }
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        int[] cnt=new int[26];
        for(char c:magazine.toCharArray()){
            cnt[c-'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            cnt[c-'a']--;
            if(cnt[c-'a']<0){
                return false;
            }
        }
        return true;
    }
}

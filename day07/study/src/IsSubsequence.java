public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));

    }
    public static boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        char[] str=s.toCharArray();
        char[] tt=t.toCharArray();
        int i=str.length-1;
        int j=tt.length-1;
        while(i>=0&&j>=0){
            if(str[i]==tt[j]){
                i--;
            }
            j--;
        }
        return i==-1;
    }
}

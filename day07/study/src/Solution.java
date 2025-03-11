public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalinderrome("0p"));
        System.out.println(isPalinderrome(" "));

    }
    public static boolean isPalinderrome(String s){
        char[] str=s.toLowerCase().toCharArray();
        int i=0,j=str.length-1;
        boolean flag=false;
        if(j==0){
            return true;
        }
        while(i<j){
            while(i<j&&!Character.isLetterOrDigit(str[i])){
                i++;
            }
            while(i<j&&!Character.isLetterOrDigit(str[j])){
                j--;
            }
            if(str[i]==str[j]){
                flag=true;
                i++;
                j--;
            }else{
                return false;
            }
        }
        return flag;
    }
}

public class StrStr {
    public static void main(String[] args) {
        System.out.println(new StrStr().strStr("sdbutsad", "sad"));

    }
    public int strStr(String haystack, String needle) {
        int n=haystack.length(), m=needle.length();
        for(int i=0;i+m<=n;i++){
            boolean flag=true;
            for(int j=0;j<m;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                return i;
            }
        }
        return -1;
    }
}

public class Length {
    public static void main(String[] args) {
         String s="luffy is still joyboy";
         System.out.println(new Length().lengthOfLastWord(s));
    }
    public int lengthOfLastWord(String s) {
        char[] str=s.toCharArray();
        int t=0;
        int count=0;
        for(int i=0;i<str.length;i++){
            if(str[i]!=' '){
                t++;
            }else{
                if(t>count){
                    count=t;
                    t=0;
                }else{
                    t=0;
                }
            }
        }
        return count;
    }
}

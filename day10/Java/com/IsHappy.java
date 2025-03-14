package Java.com;

public class IsHappy {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    private static boolean isHappy(int i) {
        while(i!=1){
            int t=i/100;
            int d=i/10%10;
            int h=i%10;
            i=t*t+d*d+h*h;
            if(i==4){
                return false;
            }
        }
        return true;
    }
    private static boolean isHappy2(int i) {
        while(i!=1&&i!=4){
            int sum=0;
            while(i>0){
                int digit=i%10;
                sum+=digit*digit;
                i/=10;
            }
            i=sum;
        }
        return i==1;
    }
}

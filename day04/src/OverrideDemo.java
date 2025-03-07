public class OverrideDemo {
    public static void main(String[] args) {
       cat c=new cat();
        c.cry();

    }
}
 class Animal {
     public void cry() {
         System.out.println("叫声");
     }
 }
class cat extends Animal{
        @Override
    public void cry(){
        System.out.println("喵喵喵");
    }
 }


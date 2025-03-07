public class Inheritancedemo {
    public static void main(String[] args) {
       B b=new B();
       b.print();
    }
}
class A{
    String name="父类";
}
class B extends A {
    String name="子类";
    public void print(){
        String name="子类1";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
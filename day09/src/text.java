public class text {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.multiply(3, 4);
        System.out.println("乘积：" + result);
    }





public static  class Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }
}}
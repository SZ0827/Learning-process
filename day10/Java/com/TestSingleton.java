package Java.com;

import Java.com.SingletonLazy;

public class TestSingleton {
    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        System.out.println(singletonLazy == singletonLazy1);
    }
}

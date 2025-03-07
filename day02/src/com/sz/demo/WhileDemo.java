package com.sz.demo;

public class WhileDemo {
    public static void main(String[] args) {
        System.out.println(calc());

    }
        public static int calc(){
            double money=10000;
            double rate=0.017;
            int year=0;
            while(money<=20000){
                year++;
                money=money*(1+rate);
            }

        return year;
    }

}
package com.sz.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //完成健康计算器
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身高：");
        double height = sc.nextDouble();
        System.out.println("请输入你的体重：");
        double weight = sc.nextDouble();
        System.out.println("请输入你的性别：");
        String sex= sc.next();
        System.out.println("请输入你的年龄");
        int age=sc.nextInt();
        double bmi=calaBMR(height,weight,sex,age);
        System.out.println(("你的bmr值是"+bmi));
        System.out.println("你的bmi是"+calaBMR(height,weight));
    }
    public static double calaBMR(double height,double weight){
        double bmi=weight/(height*height);
        return bmi;
    }
    //计算BMR
    public static double calaBMR(double height,double weight,String sex,int age){
        double bmr=0;
        if(sex.equals(sex)){
            bmr=66+(13.7*weight)+(5*height)-(6.8*age);
        }else{
            bmr=655+(9.6*weight)+(1.8*height)-(4.7*age);
        }
        return bmr;
    }
}

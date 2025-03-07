package com.sz.demo;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        System.out.println("欢迎使用简单计算器");
        System.out.println("请选择你要进行的操作");
        System.out.println("1.加法");
        System.out.println("2.减法");
        System.out.println("3.乘法");
        System.out.println("4.除法");
        Scanner scanner = new Scanner(System.in);
        int choice=scanner.nextInt();
        System.out.println("请输入第一个数字");
        double num1=scanner.nextDouble();
        System.out.println("请输入第二个数字");
        double num2=scanner.nextDouble();
        double result=0;
        switch (choice){
            case 1:
                result=num1+num2;
                break;
            case 2:
                result=num1-num2;
                break;
            case 3:
                result=num1*num2;
                break;
            case 4:
                result=num1/num2;
                break;
            default:
                System.out.println("输入有误");
                return;
        }
        System.out.println("结果是" + result);


    }
}

package com.sz.demo;

public class MultiplicationTable {
    public static void main(String[] args) {
print();
    }
    public static void print() {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                int sum=i*j;
                System.out.print(i+"*"+j+"="+sum+" ");
            }
            System.out.println();
        }
    }
}

package com.sz;

public class Card {
    public static void main(String[] args) {
printCard(52);
    }
    public static void printCard(int arr){
        int[] num={1,2,3,4,5,6,7,8,9,10,11,12,13};
        String[] color={"红桃","方片","梅花","黑桃"};
        String[] arry=new String[arr];
            int count=0;
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < color.length; j++) {
                    System.out.print(color[j] + num[i]+"\t");
                    arry[count++]=color[j] + num[i];
                }
            }
            System.out.println();

        //打印arr[]数组
        for(int i=0;i<arr;i++){
            System.out.print(arry[i]+"\t");
        }
        System.out.println();
        for(int i=0;i<arr;i++){
            int temp1=(int)(Math.random()*52);
            int temp2=(int)(Math.random()*52);
            String temp=arry[temp1];
            arry[temp1]=arry[temp2];
            arry[temp2]=temp;
        }
        for(int i=0;i<arr;i++){
            System.out.print(arry[i]+"\t");
        }
    }
}

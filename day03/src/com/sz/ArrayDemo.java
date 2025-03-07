package com.sz;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        inputScore();
    }
    //输出每个学生成绩，并计算班级平均分，最高分，最低分
    public static void inputScore(){
        double[] scores=new double[8];
        for(int i=0;i<8;i++){
            System.out.println("请输入第" + (i+1) + "个学生成绩");
            Scanner X=new Scanner(System.in);
            scores[i]=X.nextDouble();
        }
        double sum=0;
        for(int i=0;i<8;i++){
            sum+=scores[i];
        }
         System.out.println("班级平均分为："+sum / 8.0);
           int max=0;
           int min=0;
           for(int i=0;i<8;i++){
               if(scores[i]>scores[max]){
                   max=i;
               }else if(scores[i]<scores[min]){
                        min=i;
            }
        }
        System.out.println("最高分为："+scores[max]);
        System.out.println("最低分为："+scores[min]);
    }


}

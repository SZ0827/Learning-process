package com.sz;

public class Arraytext {
    public static void main(String[] args) {
        input();
    }
        public static void input(){
        String[][] className={{"张三","李四","王五","赵六"},{"赵四","钱五","孙六","周七"}};
        for(int i=0;i<className.length;i++){
            for(int j=0;j<className[i].length;j++){
                System.out.print(className[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i=0;i<className.length;i++){
            for (int j=0;j<className[i].length;j++){
                //打乱二维数组，每一行进行随机打乱
                int temp=(int)(Math.random()*4);
                String temp1=className[i][j];
                className[i][j]=className[i][temp];
                className[i][temp]=temp1;
            }
            for(int j=0;j<className[i].length;j++){
                System.out.print(className[i][j]+"\t");
            }
            System.out.println();
        }
        }
}

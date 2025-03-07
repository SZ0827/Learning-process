package com.sz;
//使用静态变量统计用户数量
public class User {
    private static int count=0;
    public User() {
        count++;
    }
        public static void print1(){
            System.out.println("静态方法");
        }
        public void print2(){
            System.out.println("普通方法");
        }

    public static void main(String[] args) {
        User u1=new User();
        User u2=new User();
        User u3=new User();
        System.out.println("用户数量为："+count);
        User.print1();
        User user=new User();
        user.print2();
    }

}


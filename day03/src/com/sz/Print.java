package com.sz;

public class Print {
    private Student stu;
    public  Print(){
        System.out.println("无参构造器");
    }
    public  Print(Student stu){
        this.stu=stu;
    }

    public void print(){
        System.out.println("姓名："+stu.getName());
        System.out.println("年龄："+stu.getAge());
    }
}

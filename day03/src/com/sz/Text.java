package com.sz;

public class Text {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setName("张三");
        stu1.setAge(18);
        stu1.Student(stu1.getName(), stu1.getAge());
        stu1.Student();
        new Print();
        Print print=new Print(stu1);
        print.print();
    }
}

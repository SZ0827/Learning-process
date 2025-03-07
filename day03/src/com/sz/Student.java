package com.sz;

public class Student {
    public String getName() {
        return name;
    }

    public void Student(){
        System.out.println("Student");
    }
    public void Student(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("名字: "+name+"年龄: "+age);
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

}

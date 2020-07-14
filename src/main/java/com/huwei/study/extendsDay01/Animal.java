package com.huwei.study.extendsDay01;

public class Animal {
    private String name;
    private int  age;

    public Animal(String name,int age){
        this.name= name;
        this.age=age;
    }


    public void eat(){
        System.out.println(name+"吃东西");
    }

    public void run(){
        System.out.println(name+"跑步");
    }

}

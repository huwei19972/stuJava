package com.huwei.study.day03overrideAndOverload;

public class computer {

    public void move() {
        System.out.println("电脑谁家强!");
    }
}

class dell extends computer {
    public void move() {
        System.out.println("戴尔 nb!");
    }

    public void bark() {

        System.out.println("干什么");
    }
}


class TestDog {
    public static void main(String args[]) {
        computer computer = new computer(); // computer 对象
        computer dell = new dell(); // dell 对象
        computer.move();// 执行 computer 类的方法
        dell.move();//执行 dell 类的方法
        //此处会报错因为computer 没有bark方法
//        dell.bark();
    }
}



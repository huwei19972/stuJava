package com.huwei.study.day02extends;

class animal {

    void eat(){
        System.out.println("Animal eat something");
    }

    final void run(){

    }
}

//extends 继承父类
class Dog extends animal{

    void eat() {
        System.out.println("dog eat something");
    }
    void eatTest(){
        //this 引用自己的类
        this.eat();
        //super 引用父类
        super.eat();
    }

}


class test{
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eatTest();
    }


}

//final 声明类,不能被继承
final class dog{
    //final 修饰方法 不能子类重写
    final void run(){

    }
}






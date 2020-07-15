package com.huwei.study.day02extends;

//使用父类有参或无参构造方法
class computer {

    computer() {
        System.out.println("买电脑吗?");
    }

    computer(int n) {
        System.out.println("买多少钱电脑" + n + "块");
    }
}


class dell extends computer {

    dell() {
        //调用computer 有参构造方法
        super(100);
        System.out.println("dell nb");
    }

    dell(int b){
        //调用computer 无参数构造方法
        System.out.println("dell is "+b);
    }
}


class test1 {
    public static void main(String[] args) {
        dell dell = new dell();
        /*
            买多少钱电脑100块
            dell nb
         */

        //调用dell有参构造方法
        dell dell1 = new dell(100);
        /*
            买电脑吗?
            dell is 100
         */
    }
}
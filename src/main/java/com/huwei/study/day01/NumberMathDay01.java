package com.huwei.study.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NumberMathDay01 {

    public static void main(String args[]) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

    }

    public static void numberAndMath(){

        Double c = -1.2;
        Integer a = 1;

        System.out.println(Math.abs(c));
        //将 Number 对象转换为xxx数据类型的值并返回。
        System.out.println(a.doubleValue());
        //将number对象与参数比较。
        System.out.println(c.compareTo((double) a));
        //随机数 返回double 大小为0.0-1.0
        System.out.println(Math.random());

        System.out.println(Integer.valueOf("12"));

        //Character 在对象中包装一个char的值
        Character character = 'c';

        //是不是字母
        System.out.println(Character.isLetter(character));
        //是不是数字
        System.out.println(Character.isDigit(character));
        //是不是空白字符
        System.out.println(Character.isWhitespace(character));
        //是不是大写字母
        System.out.println(Character.isUpperCase(character));
        //是不是小写字母
        System.out.println(Character.isLowerCase(character));
        //转大小写
        System.out.println(Character.toUpperCase(character));
        System.out.println(Character.toLowerCase(character));
    }



    public static void string(){

        String start = "一支穿云箭";
        String end = "千军万马来相见";

        System.out.println(start.length()); //5

        //连接
        System.out.println(start.concat(end));
        System.out.println(start + end);

        //格式化输出
        float floatVar = 1.2f;
        int intVar = 3;
        String stringVar = "cc";
        System.out.printf("浮点型变量的值为 " + "%f, 整型变量的值为 " + " %d, 字符串变量的值为 " + "is %s", floatVar, intVar, stringVar);
        //format接收格式化
        String fs = String.format("浮点型变量的值为 " + "%f, 整型变量的值为 " + " %d, 字符串变量的值为 " + " %s", floatVar, intVar, stringVar);

        System.out.println();

        //返回指定索引的char值
        System.out.println(start.charAt(1)); //支


        //String 字符串与another String比较 ,返回差值,相同返回0
        String cc="abcdfff";
        System.out.println(cc.compareTo("a"));  //6
        //不考虑大小写
        System.out.println(cc.compareToIgnoreCase("ABCd")); //3

        //当字符串与指定的StringBuffer有相同顺序的字符时候返回真。
        StringBuffer stringBuffer = new StringBuffer("一支穿云箭");
        System.out.println(start.contentEquals(stringBuffer));   //true

        //返回数组中表示该字符序列的 String
        char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'r', 'u', 'n', 'o', 'o', 'b'};
        String Str2= null;
        System.out.println(Str2.copyValueOf(Str1));  //hello runoob
        //offset开始索引,count长度
        System.out.println(Str2.copyValueOf(Str1, 0, 4));  //hell

        //测试此字符串是否以指定的后缀结束
        String endsWith ="1234";
        System.out.println(endsWith.endsWith("4")); //true

        //String 与 对象比较 ,返回boolean
        System.out.println("123".equals("1234")); //false
        System.out.println("abc".equalsIgnoreCase("ABC")); //不区分大小写  true

    }




    public static void stringbufferAndStringbuilder(){

        //Stringbuilder and Stringbuffer
        //两个基本一样,不安全,但是更快
        //
        StringBuilder builder =new StringBuilder();
        builder.append("你说你");
        builder.append(1314);
        builder.append(5.21);

        System.out.println(builder);  //你说你13145.21
        //反转
        System.out.println(builder.reverse()); //12.54131你说你
        //插入字符 (插入位,插入值)
        System.out.println(builder.insert(1,"?")); //1?2.54131你说你

        //删除字符 (开始位,结束位),不包含结束位
        System.out.println(builder.delete(0,8)); //1你说你

        //更换字符 (开始位,结束位,插入的字符串)
        System.out.println(builder.replace(0,8,"cc")); //cc

        System.out.println(builder.capacity());
    }

    public static void date(){

        try{
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            //默认为当前时间
            Date date =new Date();
            Date time =df.parse("2020-01-01 14:12:00");
            //比较时间是否在某个时间后
            new Date().after(time); //true
            //比较时间是否在某个时间前
            new Date().before(df.parse("2020-10-01 14:12:00")); //true
            //复制一个时间对象
            time.clone();
            //比较两个时间,左边大于右边返回1,等于0,小于-1
            System.out.println(date.compareTo(time));   //1
            //比较两个时间是否相等 true:false
            date.equals(time);
            //比较两个时间是否相等  小于-1,等于0,大于1
            date.compareTo(time);   //1
            //获取毫秒级时间(时间戳)
            date.getTime();  //1594450072357
            //获取哈希值
            date.hashCode();
            //以毫秒级时间设置参数
            date.setTime(946656000000L);  //2000-01-01 00:00:00
            //格式化输出
            System.out.printf("%tc",date);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void calendar(){
        try{
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //获取当前时间
            Calendar calendar =Calendar.getInstance();
            //set 设置时间
            calendar.set(2020,10,07,14,22,22);  //2020-11-07 14:22:22
            calendar.set(calendar.YEAR,1999);   //1999-11-07 14:22:22
            //add 增加时间
            calendar.add(Calendar.YEAR,1); //2020-11-07 14:22:22
            //get 获得某个时间
            int day = calendar.get(Calendar.DAY_OF_WEEK); //1周日,2周一,3周二...   day=3
            int a =calendar.get(Calendar.MONTH)+1;  //月份从0开始所以+1   a=11;


            System.out.printf("%tc%n",calendar);
            System.out.println(a+"\n"+day);
            System.out.println(dateFormat.format(calendar.getTime()));


        }catch (Exception e){

        }
    }
}
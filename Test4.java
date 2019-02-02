package com;

/**
 * Author:Fanleilei
 * Created:2019/2/2 0002
 */
public class Test4 {


    public static void main(String[] args) {
        //三目运算符
        int x=2;
        //i++  ++i
        //i--  --i
        int y=3;
        int ret=x<y?x:y;//取两个数中最小的
        System.out.println(ret);


        //比较运算符<,<=,>,>=,==，返回布尔值
        char ch='A';
        int num=9;
        System.out.println(ch>num);

        //逻辑运算符  与 &&（&）  非 ||(|)
        //用"&&"(短路与)，只要有条件返回false，剩余条件不再判断，返回false
        //使用"&"时，明确的表示多个条件都判断了，如果在多个表达式中有条件返回了false，剩余的条件也要判断
        //非 ||(|)同理

        System.out.println(2> 3 && 4 < 7); //false
        System.out.println(2 < 3 && 4 < 7);


        //位运算符 & ^ ~  |
        //& 有一个0就是0；  |有一个1就是1
        System.out.println(2&3);
        //0010
        //0011
        //&之后，结果为0010  2

        //!
        System.out.println(!(2<3));//false

           }
}

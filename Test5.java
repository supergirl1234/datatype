package com;

/**
 * Author:Fanleilei
 * Created:2019/2/2 0002
 */
public class Test5 {

    //函数递归
    public static long computerFac(long i) {
        if(i==1L){
           return 1L;

        }else{

            return i* computerFac(i-1);
        }

    }

    public static void main(String[] args) {

        long ret=computerFac(6);
        System.out.println(ret);

    }
}

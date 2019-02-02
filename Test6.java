package com;

/**
 * Author:Fanleilei
 * Created:2019/2/2 0002
 */
public class Test6 {

    public static void mulitTable(int row,int col) {

        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        mulitTable(5,5);


    }
}

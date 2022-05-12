package com.hillel.homework;

public class Test3 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int c = 30;
        //| a- b | / (a + b) ^3 - √c
        double result = Math.abs(a - b) / Math.pow(a + b, 3) - Math.sqrt(c);

        System.out.println("result=" + result);
    }
}

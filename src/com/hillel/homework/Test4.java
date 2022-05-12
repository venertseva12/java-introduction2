package com.hillel.homework;

public class Test4 {
    public static void main(String[] args) {


        double radius1 = 1;
        double radius2 = 0.5;
        double radius3 = 0.2;
        double density = 0.7;

        // v=4.0/3pR^3

        double v1 = 4.0 / 3 * 3.14 * Math.pow(radius1, 3);
        double v2 = 4.0 / 3 * 3.14 * Math.pow(radius2, 3);
        double v3 = 4.0 / 3 * 3.14 * Math.pow(radius3, 3);
        // m=pV

        double m1 = v1 * density;
        double m2 = v2 * density;
        double m3 = v3 * density;

        double result = (m1 + m2 + m3);

        System.out.println("result" + result);


    }

}

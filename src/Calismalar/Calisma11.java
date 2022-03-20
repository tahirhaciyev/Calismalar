package Calismalar;

import java.util.Scanner;

public class Calisma11 {
    /*
    // task1
    private static final double radius=7.5; // Radius deyisdirilemez olur

    public static void main(String[] args) {
        double perimetr=2*Math.PI*radius;
        double area= Math.PI*radius*radius;
        System.out.println("Perimetr =" + perimetr);
        System.out.println("Area= " + area);
    }

     */

    //task2
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Radiusu daxil edin:");

        double R=sc.nextDouble();
        System.out.println("Perimetr = " + 2*Math.PI*R);
        System.out.println("Sahe = " + Math.PI*R*R);
    }
}

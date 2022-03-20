package Calismalar33_43;

import java.util.Scanner;

public class Exercise35 {
    /*
    Çoxbucaqlının sahəsini hesablamaq üçün Java proqramını yazın. Redaktora gedin
    Çoxbucaqlının sahəsi = (n*s^2)/(4*tan(π/n))   burada n  n tərəfli çoxbucaqlıdır və s tərəfin uzunluğudur
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon: ");
        int ns = input.nextInt();
        System.out.print("Input the length of one of the sides: ");
        double side = input.nextDouble();
        System.out.print("The area is: " + polygonArea(ns, side) + "\n");
    }

    public static double polygonArea(int ns, double side) {
        return (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
    }
}

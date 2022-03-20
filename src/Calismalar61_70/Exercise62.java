package Calismalar61_70;

import java.util.Scanner;

public class Exercise62 {
    public static void main(String[] args) {
        /*
        Üç tam dəyəri qəbul edən onlardan biri 20 və ya daha çox
        digərlərinin çıxılmalarından az olarsa, doğru olanı qaytaran Java proqramı yazın.
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number : ");
        int z = in.nextInt();
        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
    }
}

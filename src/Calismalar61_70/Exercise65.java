package Calismalar61_70;

import java.util.Scanner;

public class Exercise65 {
    /*
    Heç bir daxili modul operatorundan istifadə etmədən iki ədədin modullarını hesablamaq üçün Java proqramını yazın.

     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();
        System.out.print("Input the second number: ");
        int b = in.nextInt();
        int divided = a / b;
        int result = a - (divided * b);
        System.out.println(result);

    }
}

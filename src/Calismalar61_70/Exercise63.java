package Calismalar61_70;

import java.util.Scanner;

public class Exercise63 {
    /*
    İstifadəçidən iki tam dəyər qəbul edən və daha böyük dəyərləri qaytaran Java proqramı yazın.
    Ancaq iki dəyər eynidirsə, 0-ı qaytarın və 6-ya bölündükdə iki dəyər eyni qalığa malikdirsə, kiçik dəyəri qaytarın.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();
        System.out.print("Input the second number: ");
        int b = in.nextInt();
        System.out.println("Result: "+result(a, b));
    }
    public static int result(int x, int y)
    {
        if(x == y)
            return 0;
        if(x % 6 == y % 6)
            return (x < y) ? x : y;
        return (x > y) ? x : y;
    }
}

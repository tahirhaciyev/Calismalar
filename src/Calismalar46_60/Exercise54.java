package Calismalar46_60;

import java.util.Scanner;

public class Exercise54 {
    public static void main(String[] args) {
        /*
İstifadəçidən üç tam ədədi qəbul edən Java proqramı yazın və
onlardan iki və ya daha çoxunun (tam ədədlər) ən sağdakı rəqəmi eyni olarsa, həqiqəti qaytarın.
 Tam ədədlər mənfi deyil.
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number : ");
        int z = in.nextInt();
        System.out.print("The result is: "+test_last_digit(x, y, z,true));
        System.out.print("\n");
    }

    public static boolean test_last_digit(int p, int q, int r, boolean xyz)
    {
        return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
    }
}

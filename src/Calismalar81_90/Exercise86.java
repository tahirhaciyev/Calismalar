package Calismalar81_90;

import java.util.Scanner;

public class Exercise86 {
    /*
    n tam ədədi ilə başlayan Java proqramını yazın,
    n cütdürsə n-i 2-yə bölün və ya 3-ə vurun və n təkdirsə 1-i əlavə edin, n = 1-ə qədər prosesi təkrarlayın.
     */
    public static void main(String[] args) {
        System.out.println("Input the value of n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            }
            else {
                n = (3 * n + 1) / 2;
            }
        }
        System.out.println("\nValue of n = "+n);
        in.close();
    }
}

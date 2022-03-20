package Calismalar46_60;

import java.util.Scanner;

public class Exercise49 {
    /*
    Nömrəni qəbul etmək və nömrənin cüt olub olmadığını yoxlamaq üçün Java proqramı yazın.
    Rəqəm cütdürsə 1, təkdirsə 0 çap edir.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        if (n % 2 == 0) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}

package Calismalar33_43;

import java.util.Scanner;

public class Exercise37 {
    /*
    Sətri tərsinə çevirmək üçün Java proqramı yazın
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = scanner.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");

    }
}

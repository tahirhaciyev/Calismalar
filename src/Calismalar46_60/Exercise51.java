package Calismalar46_60;

import java.util.Scanner;

public class Exercise51 {
    /*

Java-da sətri tam ədədə çevirmək üçün Java proqramı yazın
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String str1 = in.nextLine();
        int result = Integer.parseInt(str1);
        System.out.printf("The integer value is: %d",result);
        System.out.printf("\n");
    }
}

package Calismalar61_70;

import java.util.Scanner;

public class Exercise61 {
    /*
    Sözü tərsinə çevirmək üçün Java proqramı yazın.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a word: ");
        String word = in.nextLine();
        word = word.trim();
        String result = "";
        char[] ch=word.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }
        System.out.println("Reverse word: "+result.trim());

}

}

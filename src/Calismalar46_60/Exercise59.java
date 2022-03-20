package Calismalar46_60;

import java.util.Scanner;

public class Exercise59 {
    public static void main(String[] args) {
        /*
        Verilmiş sətri kiçik hərflərə çevirmək üçün Java proqramını yazın
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println(line);

    }
}

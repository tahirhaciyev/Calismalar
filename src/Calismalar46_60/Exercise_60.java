package Calismalar46_60;

import java.util.Scanner;

public class Exercise_60 {
    /*
    Cümlənin sondan əvvəlki (sondan sonrakı) sözünü tapmaq üçün Java proqramı yazın.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = in.nextLine();
        String[] words = line.split("[ ]+");
        System.out.println("Penultimate word: "+words[words.length - 2]);
    }
}

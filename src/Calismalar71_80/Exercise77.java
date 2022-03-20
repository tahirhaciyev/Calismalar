package Calismalar71_80;
import java.util.Arrays;

public class Exercise77 {
    /*
    Üç elementli iki tam ədəd massivindən uzunluğu 2 olan yeni massiv yaratmaq üçün Java proqramı yazın və
    yeni massiv iki massivin birinci və sonuncu elementlərini ehtiva edəcək.
     */
    public static void main(String[] args) {
        int[] array1 = {50, -20, 0};
        int[] array2 = {5, -50, 10};
        System.out.println("Array1: "+Arrays.toString(array1));
        System.out.println("Array2: "+Arrays.toString(array2));
        int[] array_new = {array1[0], array2[2]};
        System.out.println("New Array: "+Arrays.toString(array_new));
    }
}

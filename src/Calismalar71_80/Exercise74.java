package Calismalar71_80;

public class Exercise74 {
    /*
    10-un tam ədədlər massivinin birinci və ya sonuncu elementi kimi göründüyünü yoxlamaq üçün Java proqramı yazın.
     Massivin uzunluğu 2-dən böyük və ya ona bərabər olmalıdır.
     */
    public static void main(String[] args) {
        int[] num_array = {10, -20, 0, 30, 40, 60, 10};
        System.out.println((num_array[0] == 10 || num_array[num_array.length-1] == 10));
    }
}

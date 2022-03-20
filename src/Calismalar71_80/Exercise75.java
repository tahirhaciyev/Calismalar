package Calismalar71_80;

public class Exercise75 {
    /*
    Tam ədədlər massivinin birinci və sonuncu elementinin eyni olub olmadığını yoxlamaq üçün Java proqramı yazın.
    Massivin uzunluğu 2-dən böyük və ya ona bərabər olmalıdır
     */
    public static void main(String[] args) {
        int[] num_array = {50, -20, 0, 30, 40, 60, 10};

        System.out.println (num_array.length >= 2 && num_array[0] ==  num_array[num_array.length-1]);
    }
}

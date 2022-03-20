package Calismalar71_80;

public class Exercise71 {
    /*
    Hər bir sətirdən birinci simvolu silmək istisna olmaqla,
    iki sətirin birləşməsini yaratmaq üçün Java proqramı yazın. Simlərin uzunluğu 1 və yuxarı olmalıdır.
     */
    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "Tutorial";

        System.out.println(str1.substring(1) + str2.substring(1));
    }
}

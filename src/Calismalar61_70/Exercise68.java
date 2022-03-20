package Calismalar61_70;

public class Exercise68 {
    /*
    Orijinal sətirin son 3 simvolundan 4 nüsxədən ibarət yeni sətir yaratmaq üçün Java proqramını yazın.
     Orijinal sətirin uzunluğu 3 və daha çox olmalıdır.

     */
    public static void main(String[] args) {
        String main_string = "Python 3.0";

        String last_three_chars = main_string.substring(main_string.length() - 3);
        System.out.println(last_three_chars + last_three_chars + last_three_chars + last_three_chars);
    }
}

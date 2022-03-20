package Calismalar81_90;

public class Exercise84 {
    /*
    Verilmiş sətirdən son üç simvolu götürmək üçün Java proqramı yazın və üç simvolu həm ön, həm də arxa tərəfə əlavə edin.
     Sim uzunluğu üç və ya daha çox olmalıdır.
     */
    public static void main(String[] args) {
        String string1 = "Python";
        int slength = 3;
        if (slength > string1.length()) {
            slength = string1.length();
        }

        String subpart = string1.substring(string1.length()-3);
        System.out.println(subpart + string1 + subpart);

    }
}

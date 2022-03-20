package Calismalar61_70;

public class Exercise70 {
    /*
    İki sətirdən short_string + long_string + short_string şəklində sətir yaratmaq üçün Java proqramı yazın.
    Simlər eyni uzunluğa malik olmamalıdır.
     */
    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "Tutorial";

        if(str1.length() >= str2.length())
            System.out.println( str2+str1+str2);
        else
            System.out.println(str1+str2+str1);
    }
}

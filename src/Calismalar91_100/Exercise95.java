package Calismalar91_100;

import java.util.Arrays;

public class Exercise95 {
    /*
    Sətir dəyərlərindən ibarət massiv (uzunluq # 0) yaratmaq üçün
    Java proqramını yazın. Elementlər "0", "1", "2" ... ilə ... n-1 arasında olacaq.
     */
    public static void main(String[] args) {
        int n= 5;
        String[] arr_string = new String[n];

        for(int i = 0; i < n; i++)
            arr_string[i] = String.valueOf(i);
        System.out.println("New Array: "+ Arrays.toString(arr_string));
    }
}

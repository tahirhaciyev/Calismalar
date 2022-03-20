package Calismalar71_80;

import java.util.Arrays;

public class Exercise78 {
    /*
    Uzunluğu 2 olan verilmiş tam ədədlər massivində 4 və ya 7 olduğunu yoxlamaq üçün Java proqramını yazın.
     */
    public static void main(String[] args) {
        int[] array_nums = {5, 7};
        System.out.println("Original Array: "+ Arrays.toString(array_nums));
        if(array_nums[0] == 4 || array_nums[0] == 7)
            System.out.println("True");
        else
            System.out.println(array_nums[1] == 4 || array_nums[1] == 7);
    }
}

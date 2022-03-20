package Calismalar81_90;

import java.util.Arrays;

public class Exercise82 {
    /*
    Tam ədədlər (hətta uzunluq) massivindən birinci,
    sonuncu və orta qiymətlər arasında ən böyük elementi tapmaq üçün Java proqramını yazın.
     */
    public static void main(String[] args) {
        int[] array_nums = {20, 30, 40, 50, 67};
        System.out.println("Original Array: "+ Arrays.toString(array_nums));
        int max_val = array_nums[0];
        if(max_val <= array_nums[array_nums.length-1])
            max_val = array_nums[array_nums.length-1];
        if(max_val <= array_nums[array_nums.length/2])
            max_val = array_nums[array_nums.length/2];
        System.out.println("Largest element between first, last, and middle values: "+max_val);
    }
}

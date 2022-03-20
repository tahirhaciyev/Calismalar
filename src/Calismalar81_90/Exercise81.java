package Calismalar81_90;

import java.util.Arrays;

public class Exercise81 {
    /*
     Massivin birinci və sonuncu elementlərini dəyişdirmək üçün
     Java proqramı yazın (uzunluq ən azı 1 olmalıdır) və yeni massiv yaradın.
     */
    public static void main(String[] args) {
        int[] array_nums = {20, 30, 40};
        System.out.println("Original Array: "+ Arrays.toString(array_nums));
        int x = array_nums[0];
        array_nums[0] = array_nums[array_nums.length-1];
        array_nums[array_nums.length-1] = x;
        System.out.println("New array after swaping the first and last elements: "+Arrays.toString(array_nums));
    }
}

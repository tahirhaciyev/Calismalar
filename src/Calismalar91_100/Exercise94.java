package Calismalar91_100;

import java.util.Arrays;

public class Exercise94 {
    /*
    Verilmiş tam ədədlər massivinin bütün elementlərini elə tənzimləmək üçün Java proqramı yazın ki,
     bütün tək ədədlər bütün cüt ədədlərdən əvvəl olsun.
     */
    public static void main(String[] args) {
        int[] array_nums = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};

        int i = 0;
        System.out.println("Original Array: "+ Arrays.toString(array_nums));
        while(i < array_nums.length && array_nums[i] % 2 == 0)
            i++;

        for(int j = i + 1; j < array_nums.length; j++) {
            if(array_nums[j] % 2 != 0) {
                int temp = array_nums[i];
                array_nums[i] = array_nums[j];
                array_nums[j] = temp;
                i++;
            }
        }

        System.out.println("New Array: "+Arrays.toString(array_nums));
    }
}

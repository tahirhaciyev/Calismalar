package Calismalar46_60;

public class Exercise48 {
    /*
    1-dən 99-a qədər tək ədədləri çap etmək üçün Java proqramını yazın. Hər sətirə bir ədəd çap edir.
     */
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

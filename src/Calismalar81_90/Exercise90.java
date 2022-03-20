package Calismalar81_90;

public class Exercise90 {
    /*
    PATH, TEMP, USERNAME mühit dəyişəninin dəyərini əldə etmək üçün Java proqramını yazın.
     */
    public static void main(String[] args) {
        // gets the value of the specified environment variable "PATH"
        System.out.println("\nEnvironment variable PATH: ");
        System.out.println(System.getenv("PATH"));

        // gets the value of the specified environment variable "TEMP"
        System.out.println("\nEnvironment variable TEMP: ");
        System.out.println(System.getenv("TEMP"));

        // gets the value of the specified environment variable "USERNAME"
        System.out.println("\nEnvironment variable USERNAME: ");
        System.out.println(System.getenv("USERNAME"));
    }
}

package Calismalar;

import java.util.Scanner;

public class Calisma12 {
    public static void main(String[] args) {
        /*
        Rəqəmlərin ortasını hesablamaq və çap etmək üçün giriş kimi üç ədəd götürən Java proqramı yazın.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Birinci ededi daxil edin:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=(a+b+c)/3;

        System.out.println("Ededi orta= "+d);



    }

    public static class calisma7 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Ededi daxil edin:");
            int num= sc.nextInt();

            for (int i = 1; i <=10; i++) {
                System.out.println(num+ "*" + i  + "=" + (num*i)) ;

            }

        }
    }
}

import java.util.Scanner;

public class EmellerScannerle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. ededi daxil edin");
        double num1 = sc.nextDouble();

        System.out.println("2. ededi daxil edin");
        double num2 = sc.nextDouble();

        double toplama= num1+num2;
        double cixma = num1 - num2;
        double vurma= num1* num2;
        double bolme = num1 / num2;

        System.out.println("num1"+"+"+"num2" +"="    +toplama);
        System.out.println("Cixma="+cixma);
        System.out.println("Vurma="+vurma);
        System.out.println("Bolme = " + bolme);



    }
}

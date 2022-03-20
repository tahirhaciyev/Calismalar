import java.util.Scanner;

public class Emeller1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Input the first number: ");
            int n1 = scanner.nextInt();
            System.out.println("Input the second number: ");
            int n2 = scanner.nextInt();
            int sum = n1 + n2;
            int minus = n1 - n2;
            int multiply = n1 * n2;
            int subtract = n1 + n2;
            int divide = n1 / n2;
            int rnums = n1 % n2;
            System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum, minus, multiply, subtract, divide, rnums);
        }

    public static class CemScannerle {

        public static void main(String[] args) {

            //cem tapilmasi scannerle
            Scanner input = new Scanner(System.in);

            System.out.println("Birinci ededi daxil edin:");
            double num1= input.nextDouble();

            System.out.println("Ikinci ededi daxil edin:");
            double num2 = input.nextDouble();

            double cem=num1+num2;

            System.out.println("cem="+cem);

        }
    }

    public static class IkiEdedinVurulmasi {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("1. ededi daxil edin:");
            double a=sc.nextDouble();

            System.out.println("2. ededi daxil edin:");
            double b=sc.nextDouble();

            double hasil=a*b;

            System.out.println("Hasil= "+hasil);



        }

    }
}


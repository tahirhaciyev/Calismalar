public class Emeller {
    public static void main(String[] args) {
        System.out.println("Toplama= "+toplama(26,12));
        System.out.println("Cixma = "+cixma(15,27));

        double c=vurma(26,18);
        System.out.println("Vurma= "+c);

        System.out.println("Bolme= " + bolme(59,17));

    }
    public static double toplama(double a, double b) {
        return a+b;
    }
    public static double cixma(double a, double b) {
        return a-b;
    }
    public static double vurma(double a, double b) {
        return a*b;
    }
    public static double bolme(double a, double b) {
        return a/b;
    }

    public static class CemMetodla {
        public static void main(String[] args) {

            System.out.println(cem(23,25));

        }
        public static double cem(double a, double b ) {
            return a+b;

        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double MEDIA = MEDIA(A, B);
        System.out.format("MEDIA = %.5f\n", MEDIA);
        sc.close();
    }

    public static double MEDIA(double A, double B) {
        return ((A * 3.5) + (B * 7.5)) / 11;
    }

}
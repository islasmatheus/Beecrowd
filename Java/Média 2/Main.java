import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double MEDIA = MEDIA(A, B, C);
        System.out.format("MEDIA = %.1f\n", MEDIA);
        sc.close();
    }

    public static double MEDIA(double A, double B, double C) {
        return ((A * 2) + (B * 3) + (C * 5)) / 10;
    }

}
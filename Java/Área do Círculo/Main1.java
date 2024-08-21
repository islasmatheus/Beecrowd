import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio;
        double n = 3.14159;
        raio = sc.nextDouble();
        double area = area(raio, n);
        System.out.format("A=%.4f\n", area);
        sc.close();
    }

    public static double area(double raio, double n) {
        return 3.14159 * (raio * raio);
    }

}
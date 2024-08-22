import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeVendedor = sc.next();
        double salarioFixo = sc.nextDouble();
        double vendasMes = sc.nextDouble();
        double TOTAL = TOTAL(salarioFixo, vendasMes);
        System.out.format("TOTAL = R$ %.2f\n", TOTAL);
        sc.close();
    }

    public static double TOTAL(double salarioFixo, double vendasMes) {
        return salarioFixo + (vendasMes * 0.15);
    }

}
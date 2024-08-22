import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();
        double SALARY = SALARY(horasTrabalhadas, valorHora);
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.format("SALARY = U$ %.2f\n", SALARY);
        sc.close();
    }

    public static double SALARY(int horasTrabalhadas, double valorHora) {
        return horasTrabalhadas * valorHora;
    }
}

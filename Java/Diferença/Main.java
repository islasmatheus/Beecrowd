import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int DIFERENCA = DIFERENCA(A, B, C, D);
        System.out.println("DIFERENCA = " + DIFERENCA);
        sc.close();

    }

    public static int DIFERENCA(int A, int B, int C, int D) {
        return (A * B - C * D);
    }

}
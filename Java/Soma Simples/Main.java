import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int soma = soma(A, B);
        System.out.println("SOMA = " + soma);
        sc.close();
    }

    public static int soma(int A, int B) {
        return A + B;
    }
}

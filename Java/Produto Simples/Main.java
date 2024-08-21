import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int PROD = PROD(A, B);
        System.out.println("PROD = " + PROD);
        sc.close();
    }

    public static int PROD(int A, int B) {
        return A * B;
    }
}

// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        sum(n);

        scanner.close();
    }
}
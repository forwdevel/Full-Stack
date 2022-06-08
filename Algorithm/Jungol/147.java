
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(++cnt + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
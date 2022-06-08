
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int odd = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (odd > 10) {
                    odd %= 10;
                }
                System.out.print(odd + " ");
                odd += 2;
            }
            System.out.println();
        }

        scanner.close();
    }
}

// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            if (a > b) {
                for (int j = a; j >= b; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, (i * j));
                }
            } else {
                for (int j = a; j <= b; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, (i * j));
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}
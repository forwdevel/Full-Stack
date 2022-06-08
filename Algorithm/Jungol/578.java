
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void printing(int a, int b) {
        for (int i = ((a > b) ? b : a); i <= ((a > b) ? a : b); i++) {
            System.out.println("== " + i + "dan ==");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %2d\n", i, j, (i * j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        printing(a, b);

        scanner.close();
    }
}
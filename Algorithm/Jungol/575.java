
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static int squared(int a, int b) {
        int result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        if (b == 0) {
            return 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(squared(a, b));

        scanner.close();
    }
}
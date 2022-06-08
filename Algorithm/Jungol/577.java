
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static String compare(int a, int b) {

        if (a > b) {
            a /= 2;
            b *= 2;
        } else {
            b /= 2;
            a *= 2;
        }

        return "" + a + " " + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(compare(a, b));

        scanner.close();
    }
}
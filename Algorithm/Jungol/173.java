
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static int sqst(int a, int b) {
        return (a > b) ? (a * a - b * b) : (b * b - a * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(sqst(a, b));

        scanner.close();
    }
}
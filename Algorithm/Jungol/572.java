
// For Algorithm submit template
import java.util.Scanner;

class Main {

    public static void circleArea(int r) {
        System.out.printf("%.2f", Math.round((double) r * r * 3.14 * 100) / 100.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();

        circleArea(r);

        scanner.close();
    }
}
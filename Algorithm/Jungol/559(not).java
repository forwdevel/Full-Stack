
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] avg = { 85.6, 79.5, 83.1, 80.0, 78.2, 85.0 };

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(Math.round((avg[a - 1] + avg[b - 1]) * 10) / 10.0);

        scanner.close();
    }
}
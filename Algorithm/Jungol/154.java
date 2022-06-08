
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] arr = new double[6];
        double sum = 0;

        for (int i = 0; i < 6; i++) {
            arr[i] = scanner.nextDouble();
            sum += arr[i];
        }

        double avg = Math.round(sum / 6 * 10) / 10.0;

        System.out.println(avg);

        scanner.close();
    }
}
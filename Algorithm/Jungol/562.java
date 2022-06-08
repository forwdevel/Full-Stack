
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int evenSum = 0;
        int oddSum = 0;
        int cnt = 0;

        for (int i = 1; i <= 10; i++) {
            arr[i - 1] = scanner.nextInt();

            if (i % 2 != 0) {
                oddSum += arr[i - 1];
                cnt++;
            } else {
                evenSum += arr[i - 1];
            }
        }

        double avg = Math.round((double) oddSum / cnt * 10) / 10.0;

        System.out.println("sum : " + evenSum);
        System.out.println("avg : " + avg);

        scanner.close();
    }
}
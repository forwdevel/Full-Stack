
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= 10; i++) {
            arr[i - 1] = scanner.nextInt();

            if (i % 2 != 0) {
                oddSum += arr[i - 1];
            } else {
                evenSum += arr[i - 1];
            }
        }

        System.out.println("odd : " + oddSum);
        System.out.println("even : " + evenSum);

        scanner.close();
    }
}
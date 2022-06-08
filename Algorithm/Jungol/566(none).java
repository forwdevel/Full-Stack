
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            if (i > 1) {
                arr[i] = arr[i - 2] - arr[i - 1];
            } else if (i == 0) {
                arr[i] = 100;
            } else {
                arr[i] = n;
            }

            System.out.print(arr[i] + "  ");

            if (arr[i] < 0) {
                break;
            }
        }

        scanner.close();
    }
}
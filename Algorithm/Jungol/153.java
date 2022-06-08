
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] == -1) {
                if (i >= 3) {
                    System.out.print(arr[i - 3] + " " + arr[i - 2] + " " + arr[i - 1]);
                } else if (i >= 2) {
                    System.out.print(arr[i - 2] + " " + arr[i - 1]);
                } else if (i >= 1) {
                    System.out.print(arr[i - 1]);
                }
                break;
            }
        }

        scanner.close();
    }
}
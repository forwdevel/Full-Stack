
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            if (i > 1) {
                arr[i] = (arr[i - 2] + arr[i - 1]) % 10;
            }
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
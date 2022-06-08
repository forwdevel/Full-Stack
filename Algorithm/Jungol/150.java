
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
            if (i == 0 || i == 2 || i == 4) {
                sum += arr[i];
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}

// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; i != j && j < 10; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
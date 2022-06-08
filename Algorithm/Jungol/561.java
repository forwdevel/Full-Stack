
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int min = 10000;
        int max = 1;

        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] < 100 && arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] >= 100 && arr[i] < min) {
                min = arr[i];
            }
        }

        if (min == 10000) {
            min = 100;
        }
        if (max == 1) {
            max = 100;
        }

        System.out.println(max + " " + min);

        scanner.close();
    }
}

// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[100];

        arr[0] = scanner.nextInt();

        if (arr[0] == 999) {
            scanner.close();
            System.out.println("max : 0");
            System.out.println("min : 0");
            System.exit(0);
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < 100; i++) {

            arr[i] = scanner.nextInt();

            if (arr[i] == 999) {
                scanner.close();
                System.out.println("max : " + max);
                System.out.println("min : " + min);
                break;
            }

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
    }
}

// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[100];
        int[] temp = new int[100];
        int cnt = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] == 0) {
                cnt = i;
                break;
            }

            if (arr[i] % 2 != 0) {
                temp[i] = 2 * arr[i];
            } else {
                temp[i] = arr[i] / 2;
            }

        }

        System.out.println(cnt);

        for (int i = 0; i < cnt; i++) {
            System.out.print(temp[i] + " ");
        }

        scanner.close();
    }
}
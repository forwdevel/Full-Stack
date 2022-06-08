
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArr = new int[100];
        int cnt = 0;

        for (int i = 0; i < 100; i++) {
            intArr[i] = scanner.nextInt();
            if (intArr[i] == 0) {
                break;
            }
            cnt++;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(intArr[i] + " ");
        }

        scanner.close();
    }
}
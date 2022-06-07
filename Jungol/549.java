
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int oddCnt = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 1) {
                oddCnt++;
                sum += i;
                if (sum >= n) {
                    break;
                }
            }
        }

        System.out.println(oddCnt + " " + sum);

        scanner.close();
    }
}
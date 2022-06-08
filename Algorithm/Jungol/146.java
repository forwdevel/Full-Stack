
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int aCnt = 0;
        int nCnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print((char) (aCnt++ + 65) + " ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(nCnt++ + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void printArr(int n) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(++cnt + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        printArr(n);

        scanner.close();
    }
}
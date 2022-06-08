
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] first = new int[2][3];
        int[][] second = new int[2][3];

        int[][] result = new int[2][3];

        System.out.println("first array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                first[i][j] = scanner.nextInt();
            }
        }

        System.out.println("second array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                second[i][j] = scanner.nextInt();
                result[i][j] = first[i][j] * second[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
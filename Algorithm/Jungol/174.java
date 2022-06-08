
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void printing(int[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][3] += arr[i][j];
                arr[3][i] += arr[j][i];
            }
            arr[3][3] += arr[3][i];
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[4][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        printing(arr);

        scanner.close();
    }
}
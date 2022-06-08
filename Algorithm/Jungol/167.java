
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[4][2];
        int[] rowAvg = new int[4];
        int[] colAvg = new int[2];
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scanner.nextInt();
                rowAvg[i] += arr[i][j];
            }
            rowAvg[i] /= 2;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                colAvg[i] += arr[j][i];
                sum += arr[j][i];
                if (i == 0) {
                    System.out.print(rowAvg[j] + " ");
                }
            }
            if (i == 0) {
                System.out.println();
            }
            colAvg[i] /= 4;
            System.out.print(colAvg[i] + " ");
        }

        System.out.println("\n" + sum / 8);

        scanner.close();
    }
}
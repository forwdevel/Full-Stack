
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] first = new int[2][4];
        int[][] second = new int[2][4];
        int[][] multiple = new int[2][4];

        System.out.println("first array");

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                first[i][j] = scanner.nextInt();
            }
        }

        System.out.println("second array");

        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < second[i].length; j++) {
                second[i][j] = scanner.nextInt();
                multiple[i][j] = first[i][j] * second[i][j];
            }
        }

        for (int i = 0; i < multiple.length; i++) {
            for (int j = 0; j < multiple[i].length; j++) {
                System.out.print(multiple[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
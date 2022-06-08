
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] score = new int[4][3];

        int[] result = new int[4];

        for (int i = 0; i < score.length; i++) {
            System.out.print((i + 1) + "class? ");
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = scanner.nextInt();
                result[i] += score[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println((i + 1) + "class : " + result[i]);
        }

        scanner.close();
    }
}
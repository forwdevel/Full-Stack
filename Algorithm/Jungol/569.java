
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] score = new int[5][4];
        int sum = 0;
        String[] result = new String[5];
        int cnt = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = scanner.nextInt();
                sum += score[i][j];
            }
            if (sum / 4 >= 80) {
                result[i] = "pass";
                cnt++;
            } else {
                result[i] = "fail";
            }
            sum = 0;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        System.out.println("Successful : " + cnt);

        scanner.close();
    }
}
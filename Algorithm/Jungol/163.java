
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int[][] arr = {
                { 3, 5, 9 },
                { 2, 11, 5 },
                { 8, 30, 10 },
                { 22, 5, 1 },
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(sum);

        scanner.close();
    }
}
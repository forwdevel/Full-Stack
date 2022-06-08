
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[100];
        int multCnt = 0;
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] == 0) {
                break;
            } else if (arr[i] % 5 == 0) {
                multCnt++;
                sum += arr[i];
            }
        }

        double avg = Math.round((double) sum / multCnt * 10) / 10.0;

        System.out.println("Multiples of 5 : " + multCnt);
        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);

        scanner.close();
    }
}
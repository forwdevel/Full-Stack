
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = new char[100];
        int[] cnt = new int[26];

        for (int i = 0; i < 100; i++) {
            input[i] = scanner.next().charAt(0);

            if (input[i] < 65 || input[i] > 90) {
                break;
            } else {
                cnt[input[i] - 65]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (cnt[i] != 0) {
                System.out.println((char) (i + 65) + " : " + cnt[i]);
            }
        }

        scanner.close();
    }
}
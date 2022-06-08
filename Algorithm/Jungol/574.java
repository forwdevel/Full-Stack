
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static int max(int[] num) {
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            num[i] = scanner.nextInt();
        }

        System.out.println(max(num));

        scanner.close();
    }
}
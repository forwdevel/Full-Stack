
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArr = new int[10];
        int min = 1000;

        for (int i = 0; i < 10; i++) {
            intArr[i] = scanner.nextInt();
            if (intArr[i] < min) {
                min = intArr[i];
            }
        }

        System.out.println(min);

        scanner.close();
    }
}
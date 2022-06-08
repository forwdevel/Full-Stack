
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArr = new int[10];

        for (int i = 0; i < 10; i++) {
            intArr[i] = i + 1;
            System.out.print(intArr[i] + " ");
        }

        scanner.close();
    }
}
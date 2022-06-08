
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] charArr = new char[10];

        for (int i = 0; i < 10; i++) {
            charArr[i] = scanner.next().charAt(0);
            if (i == 0 || i == 3 || i == 6) {
                System.out.print(charArr[i] + " ");
            }
        }

        scanner.close();
    }
}
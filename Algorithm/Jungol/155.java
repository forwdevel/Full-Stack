
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] arr = { 'J', 'U', 'N', 'G', 'O', 'L' };

        char key = scanner.next().charAt(0);

        for (int i = 0; i < 6; i++) {
            if (arr[i] == key) {
                System.out.println(i);
                scanner.close();
                System.exit(0);
            }
        }

        System.out.println("none");

        scanner.close();
    }
}

// For Algorithm submit template
import java.util.Scanner;

class Main {

    public static void printing(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("~!@#$^&*()_+|");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();

        printing(cnt);

        scanner.close();
    }
}
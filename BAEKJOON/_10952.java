import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0, b = 0;

        while (true) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            if (a == 0 && b == 0) {
                break;
            } else {
                System.out.println(a + b);
            }

        }

        scanner.close();

    }
}

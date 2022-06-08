import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = (a > b) ? b : a; i <= ((a > b) ? a : b); i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
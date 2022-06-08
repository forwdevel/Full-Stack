import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int change1 = 0;
        int change2 = 0;

        for (int i = 0; i < 3; i++) {
            change1 *= 10;
            change2 *= 10;
            change1 += num1 % 10;
            change2 += num2 % 10;
            num1 /= 10;
            num2 /= 10;
        }

        if (change1 > change2) {
            System.out.println(change1);
        } else {
            System.out.println(change2);
        }

        scanner.close();
    }
}
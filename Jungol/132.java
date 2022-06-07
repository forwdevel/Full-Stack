import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= a; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}

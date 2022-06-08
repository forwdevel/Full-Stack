import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = 0;

        for (int i = num; i <= 100; i++) {
            sum += i;
        }

        System.out.println(sum);

        scanner.close();
    }
}

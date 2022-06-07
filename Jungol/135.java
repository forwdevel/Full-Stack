import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        int cnt = 0;

        for (int i = (a > b) ? b : a; i <= ((a > b) ? a : b); i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                cnt++;
            }
        }

        double avg = Math.round((double) sum / cnt * 10) / 10.0;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);

        scanner.close();
    }
}
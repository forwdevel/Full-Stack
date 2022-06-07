import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] num = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
            sum += num[i];
        }

        double avg = Math.round((double) sum / n * 100) / 100.0;

        System.out.println(avg);

        scanner.close();
    }
}

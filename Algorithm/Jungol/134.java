import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[10];

        int oddCnt = 0;
        int evenCnt = 0;

        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
            if (a[i] % 2 == 0) {
                evenCnt++;
            } else {
                oddCnt++;
            }
        }

        System.out.println("even : " + evenCnt);
        System.out.println("odd : " + oddCnt);

        scanner.close();
    }
}
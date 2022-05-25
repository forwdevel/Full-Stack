import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int cnt = 0;

        String[] a = new String[n];
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[i].length(); j++) {
                if (a[i].charAt(j) == 'O') {
                    cnt++;
                    score[i] += cnt;
                } else {
                    cnt = 0;
                }
            }
            System.out.println(score[i]);
            cnt = 0;
        }

        scanner.close();
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[9];

        int max = 0;
        int idx = 0;

        for (int i = 0; i < 9; i++) {
            num[i] = Integer.parseInt(scanner.nextLine());
            if (max < num[i]) {
                max = num[i];
                idx = i;
            }
        }

        System.out.println(max);
        System.out.println(idx);

        scanner.close();
    }
}

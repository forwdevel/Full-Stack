import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int compare = scanner.nextInt();

        int[] s = new int[num];

        for (int i = 0; i < num; i++) {
            s[i] = scanner.nextInt();
            if (compare > s[i]) {
                System.out.print(s[i] + " ");
            }
        }
        scanner.close();
    }
}

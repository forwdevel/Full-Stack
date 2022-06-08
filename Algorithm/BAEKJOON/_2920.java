import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[8];
        int ascnt = 0, decnt = 0;

        for (int i = 0; i < 8; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 1; i <= 8; i++) {
            if (a[i - 1] == i) {
                ascnt++;
            }
            if (a[i - 1] == 9 - i) {
                decnt++;
            }
        }

        if (ascnt == 8) {
            System.out.println("ascending");
        } else if (decnt == 8) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

        scanner.close();
    }
}

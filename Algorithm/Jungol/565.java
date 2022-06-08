
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int[] cnt = new int[10];

        while (true) {
            num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            switch (num / 10) {
                case 0:
                    cnt[0]++;
                    break;
                case 1:
                    cnt[1]++;
                    break;
                case 2:
                    cnt[2]++;
                    break;
                case 3:
                    cnt[3]++;
                    break;
                case 4:
                    cnt[4]++;
                    break;
                case 5:
                    cnt[5]++;
                    break;
                case 6:
                    cnt[6]++;
                    break;
                case 7:
                    cnt[7]++;
                    break;
                case 8:
                    cnt[8]++;
                    break;
                case 9:
                    cnt[9]++;
                    break;
                default:
                    break;
            }

        }

        for (int i = 0; i < 10; i++) {
            if (cnt[i] != 0) {
                System.out.println(i + " : " + cnt[i]);
            }
        }

        scanner.close();
    }
}
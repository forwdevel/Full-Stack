
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] cnt = new int[6];

        for (int i = 0; i < 10; i++) {
            switch (scanner.nextInt()) {
                case 1:
                    cnt[0]++;
                    break;
                case 2:
                    cnt[1]++;
                    break;
                case 3:
                    cnt[2]++;
                    break;
                case 4:
                    cnt[3]++;
                    break;
                case 5:
                    cnt[4]++;
                    break;
                case 6:
                    cnt[5]++;
                    break;
                default:
                    break;
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + " : " + cnt[i]);
        }

        scanner.close();
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = new int[10];
        int[] cnt = new int[42];

        // Time complexity = O(N)
        for (int i = 0; i < 10; i++) {
            input[i] = scanner.nextInt();
            switch (input[i] % 42) {
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
                case 10:
                    cnt[10]++;
                    break;
                case 11:
                    cnt[11]++;
                    break;
                case 12:
                    cnt[12]++;
                    break;
                case 13:
                    cnt[13]++;
                    break;
                case 14:
                    cnt[14]++;
                    break;
                case 15:
                    cnt[15]++;
                    break;
                case 16:
                    cnt[16]++;
                    break;
                case 17:
                    cnt[17]++;
                    break;
                case 18:
                    cnt[18]++;
                    break;
                case 19:
                    cnt[19]++;
                    break;
                case 20:
                    cnt[20]++;
                    break;
                case 21:
                    cnt[21]++;
                    break;
                case 22:
                    cnt[22]++;
                    break;
                case 23:
                    cnt[23]++;
                    break;
                case 24:
                    cnt[24]++;
                    break;
                case 25:
                    cnt[25]++;
                    break;
                case 26:
                    cnt[26]++;
                    break;
                case 27:
                    cnt[27]++;
                    break;
                case 28:
                    cnt[28]++;
                    break;
                case 29:
                    cnt[29]++;
                    break;
                case 30:
                    cnt[30]++;
                    break;
                case 31:
                    cnt[31]++;
                    break;
                case 32:
                    cnt[32]++;
                    break;
                case 33:
                    cnt[33]++;
                    break;
                case 34:
                    cnt[34]++;
                    break;
                case 35:
                    cnt[35]++;
                    break;
                case 36:
                    cnt[36]++;
                    break;
                case 37:
                    cnt[37]++;
                    break;
                case 38:
                    cnt[39]++;
                    break;
                case 39:
                    cnt[39]++;
                    break;
                case 40:
                    cnt[40]++;
                    break;
                case 41:
                    cnt[41]++;
                    break;
                default:
                    break;
            }
        }

        // Time complexity = O(N)
        int t = 0;
        for (int i = 0; i < 42; i++) {
            if (cnt[i] != 0) {
                t++;
            }
        }

        System.out.println(t);

        scanner.close();
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int[] used = new int[10];

        String result = "" + a * b * c;

        for (int i = 0; i < result.length(); i++) {
            switch (result.charAt(i)) {
                case '0':
                    used[0]++;
                    break;
                case '1':
                    used[1]++;
                    break;
                case '2':
                    used[2]++;
                    break;
                case '3':
                    used[3]++;
                    break;
                case '4':
                    used[4]++;
                    break;
                case '5':
                    used[5]++;
                    break;
                case '6':
                    used[6]++;
                    break;
                case '7':
                    used[7]++;
                    break;
                case '8':
                    used[8]++;
                    break;
                case '9':
                    used[9]++;
                    break;
                default:
                    break;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(used[i]);
        }
        scanner.close();
    }
}


// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] student = new int[100];
        int[] grade = new int[11];

        for (int i = 0; i < 100; i++) {
            student[i] = scanner.nextInt();

            if (student[i] == 0) {
                break;
            }

            switch (student[i] / 10) {
                case 0:
                    grade[0]++;
                    break;
                case 1:
                    grade[1]++;
                    break;
                case 2:
                    grade[2]++;
                    break;
                case 3:
                    grade[3]++;
                    break;
                case 4:
                    grade[4]++;
                    break;
                case 5:
                    grade[5]++;
                    break;
                case 6:
                    grade[6]++;
                    break;
                case 7:
                    grade[7]++;
                    break;
                case 8:
                    grade[8]++;
                    break;
                case 9:
                    grade[9]++;
                    break;
                case 10:
                    grade[10]++;
                    break;
                default:
                    break;
            }
        }

        for (int i = 10; i >= 0; i--) {
            if (grade[i] != 0) {
                System.out.println(10 * i + " : " + grade[i] + " person");
            }
        }

        scanner.close();
    }
}
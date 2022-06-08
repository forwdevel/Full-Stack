// For Algorithm submit template
import java.util.Scanner;


class Main {
    public static int abs(int integer) {
        if(integer < 0){
            return integer * -1;
        } else {
            return integer;
        }
    }
    public static double abs(double realNum) {
        if(realNum < 0){
            return realNum * -1;
        } else {
            return realNum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer_1 = scanner.nextInt();
        int integer_2 = scanner.nextInt();

        double realNum_1 = scanner.nextDouble();
        double realNum_2 = scanner.nextDouble();

        System.out.println((abs(integer_1)>abs(integer_2)) ? integer_1 : integer_2);
        System.out.printf("%.2f",(abs(realNum_1)>abs(realNum_2)) ? realNum_2 : realNum_1);

        scanner.close();
    }
}
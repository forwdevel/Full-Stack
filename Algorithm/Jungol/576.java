
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void addition(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void substraction(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public static void multiplication(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public static void division(int a, int b) {
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        char oper = scanner.next().charAt(0);

        int b = scanner.nextInt();

        switch (oper) {
            case '+':
                addition(a, b);
                break;
            case '-':
                substraction(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            case '/':
                division(a, b);
                break;
            default:
                System.out.println(a + " " + oper + " " + b + " = 0");
                break;
        }

        scanner.close();
    }
}
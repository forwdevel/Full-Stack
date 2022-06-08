// For Algorithm submit template
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 1; (i * n)< 100; i++){
            System.out.print(n*i + " ");
            if((n*i) % 10 == 0){
                break;
            }
        }

        scanner.close();
    }
}
package Algorithm.Jungol;
// For Algorithm submit template
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int numCnt = 0;
        int alphCnt=0;

        for(int i = 0; i <n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print(++numCnt+" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print((char)(alphCnt++ +65)+" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
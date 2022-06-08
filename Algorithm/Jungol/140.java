// For Algorithm submit template
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] integers = new int[20];

        int cnt = 0;
        int sum = 0;

        for(int i = 0; i < 20; i ++){
            
            integers[i] = scanner.nextInt();
            sum += integers[i];
            
            if(integers[i]==0){
                break;
            }
            cnt++;
        }

        int avg = sum / cnt;

        System.out.println(sum + " " + avg);

        scanner.close();
    }
}
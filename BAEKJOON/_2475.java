import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[5];

        for(int i = 0; i < 5; i++){
            num[i] = scanner.nextInt();
        }

        int result = ((num[0] * num[0]) + (num[1] * num[1])
                + (num[2] * num[2]) + (num[3] * num[3]) + (num[4] * num[4]))%10;
        
        System.out.println(result);

        scanner.close();
    }
}

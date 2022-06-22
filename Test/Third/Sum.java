import java.util.Scanner;

public class Sum {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            scanner.close();
            int sum = 0;

            while (n != 0) {
                  sum += n--;
            }

            System.out.println(sum);

      }
}

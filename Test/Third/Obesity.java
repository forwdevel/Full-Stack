import java.util.Scanner;

public class Obesity {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double height = scanner.nextDouble();
            double weight = scanner.nextDouble();

            scanner.close();

            System.out.println((int) (weight + 100 - height));

            if (weight + 100 - height > 0) {
                  System.out.println("Obesity");
            }
      }
}

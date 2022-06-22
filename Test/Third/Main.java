import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String name = scanner.next();
            String school = scanner.next();
            int grade = scanner.nextInt();

            Person person = new Person(name, school, grade);

            System.out.println(person);

            scanner.close();
      }
}

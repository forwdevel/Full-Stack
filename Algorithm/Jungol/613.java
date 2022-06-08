
// For Algorithm submit template
import java.util.Scanner;

class Student {
    String name;
    String school;
    int grade;

    Student(String name, String school, int grade) {
        this.name = name;
        this.school = school;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\nSchool : " + school + "\nGrade : " + grade;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        String school = scanner.next();
        int grade = scanner.nextInt();

        Student student = new Student(name, school, grade);

        System.out.println(student);

        scanner.close();
    }
}
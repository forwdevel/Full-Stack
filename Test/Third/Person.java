public class Person {
      private String name;
      private String school;
      private int grade;

      Person(String name, String school, int grade) {
            this.name = name;
            this.school = school;
            this.grade = grade;
      }

      @Override
      public String toString() {
            return "Name : " + name + "\nSchool : " + school + "\nGrade : " + grade;
      }
}

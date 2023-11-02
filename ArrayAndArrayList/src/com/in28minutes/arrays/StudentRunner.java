import java.math.BigDecimal;

public class StudentRunner {

  public static void main(String[] args) {
    int[] marks = { 75, 60, 56 };

    Student student = new Student("name", marks);
    int number = student.getNumberOfmarks();
    int sum = student.getTotalSumOfMarks();
    int maximumMark = student.getMaximumMark();
    int minimumMark = student.getMaximumMark();
    BigDecimal average = student.getAverageMarks();
    student.addMark(35);
    student.removeMarkAtIndex(5);
    // int mark1 = 100;
    // int mark2 = 75;
    // int mark3 = 60;
    // int sum = mark1 + mark2 + mark3;
  }
}

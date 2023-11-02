import java.math.BigDecimal;
import java.util.Arrays;

public class Student {

  String name;
  int[] listOfMarks = {};

  Student(String name, int[] listOfMarks) {
    this.name = name;
    this.listOfMarks = listOfMarks;
  }

  public int getNumberOfmarks() {
    return listOfMarks.length;
  }

  public int getTotalSumOfMarks() {
    int result = 0;
    for (int mark : listOfMarks) {
      result += mark;
    }
    return result;
  }

  public int getMaximumMark() {
    Arrays.sort(listOfMarks);
    return listOfMarks[listOfMarks.length - 1];
  }

  public int getMinimumMark() {
    Arrays.sort(listOfMarks);
    return listOfMarks[0];
  }

  public BigDecimal getAverageMarks() {
    BigDecimal num1 = BigDecimal.valueOf(getTotalSumOfMarks());
    BigDecimal num2 = BigDecimal.valueOf(listOfMarks.length);
    return num1.divide(num2);
  }

  public void addMark(int i) {}

  public void removeMarkAtIndex(int i) {}
}

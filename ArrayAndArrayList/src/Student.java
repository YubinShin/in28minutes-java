import java.math.BigDecimal;

public class Student {

  String name;
  String listOfMarks;

  Student(String name, String listOfMarks) {
    this.name = name;
    this.listOfMarks = listOfMarks;
  }

  public int getNumberOfmarks() {
    return 0;
  }

  public int getTotalSumOfMarks() {
    return 0;
  }

  public int getMaximumMark() {
    return 0;
  }

  public BigDecimal getAverageMarks() {
    return null;
  }

  public void addMark(int i) {}

  public void removeMarkAtIndex(int i) {}
}

package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

  @Override
  public int compare(Student student1, Student student2) {
    return Integer.compare(student1.getId(), student2.getId());
  }
}

public class StudentsCollectionRunner {

  public static void main(String[] args) {
    List<Student> students = List.of(
      new Student(1, "yubin"),
      new Student(100, "minzi"),
      new Student(2, "nyang")
    );
    System.out.println(students);

    List<Student> studentsAl = new ArrayList<>(students);
    System.out.println(studentsAl);
    Collections.sort(studentsAl, new AscendingStudentComparator());
    System.out.println(studentsAl);
  }
}

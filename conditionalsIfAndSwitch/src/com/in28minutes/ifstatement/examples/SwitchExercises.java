package com.in28minutes.ifstatement.examples;

public class SwitchExercises {

  public static void main(String[] args) {
    System.out.println(isWeekDay(1));
    System.out.println(determineNameOfDay(1));
    System.out.println(determineNameOfMonth(1));
  }

  /** return 을 하면 break 를 쓰지 않아도 됩니다.
   * 메서드에서 return 하면 그 다음 라인에 있는 코드는 실행되지 않습니다.
   */
  public static boolean isWeekDay(int daynumber) {
    switch (daynumber) {
      case 0:
      case 6:
        return false;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        return true;
    }
    return false;
  }

  public static String determineNameOfMonth(int monthNumber) {
    switch (monthNumber) {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "Invalid month number";
    }
  }

  public static String determineNameOfDay(int daynumber) {
    switch (daynumber) {
      case 0:
        return "Sunday";
      case 1:
        return "Monday";
      case 3:
        return "Wednesday";
      case 4:
        return "Thursday";
      case 5:
        return "Friday";
      case 6:
        return "Saturday";
      default:
        return "Hey~";
    }
  }
}

package com.in28minutes.ifstatement.examples;

public class SwitchExercises {

  public static void main(String[] args) {}

  public static boolean isWeekDay(int daynumber) {
    if (daynumber == 0 || daynumber == 6) {
      return false;
    }
    return true;
  }

  public static String determineNameOfMonth(int monthNumber) {
    String monthName = "";

    switch (monthNumber) {
      case 1:
        monthName = "January";
        break;
      case 2:
        monthName = "February";
        break;
      case 3:
        monthName = "March";
        break;
      case 4:
        monthName = "April";
        break;
      case 5:
        monthName = "May";
        break;
      case 6:
        monthName = "June";
        break;
      case 7:
        monthName = "July";
        break;
      case 8:
        monthName = "August";
        break;
      case 9:
        monthName = "September";
        break;
      case 10:
        monthName = "October";
        break;
      case 11:
        monthName = "November";
        break;
      case 12:
        monthName = "December";
        break;
      default:
        monthName = "Invalid month number";
    }

    return monthName;
  }

  public static String determineNameOfDay(int daynumber) {
    switch (daynumber) {
      case 0:
        return "Sunday";
        break;
      case 1:
        return "Monday";
        break;
      case 3:
        return "Wednesday";
        break;
      case 4:
        return "Thursday";
        break;
      case 5:
        return "Friday";
        break;
      case 6:
        return "Saturday";
        break;
      default:
        return "Hey~";
        break;
    }
  }
}

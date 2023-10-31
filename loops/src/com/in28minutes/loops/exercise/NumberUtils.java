package com.in28minutes.loops.exercise;

public class NumberUtils {

  public int getLastDigit(int number) {
    // Write your code here
    if (number < 0) {
      return -1;
    }

    String str = Integer.toString(number);
    return Integer.parseInt(str.substring(str.length() - 1));
  }

  /**
   * This method calculates and returns the number of digits in a given integer.
   * If the number is negative, it returns -1.
   * If the number is zero, it returns 1 as zero is considered to have one digit.
   * @param number: an integer
   * @return number of digits in number, or -1 if number is negative, or 1 if number is zero.
   */
  public int getNumberOfDigitsOne(int number) {
    // Write your code here
    if (number < 0) {
      return -1;
    }
    if (number == 0) {
      return 1;
    }
    int count = 0;
    while (number >= 1) {
      number /= 10;
      count++;
    }

    return count;
  }

  /**
   * This method calculates and returns the number of digits in a given integer.
   * If the number is negative, it returns -1.
   * If the number is zero, it returns 1 as zero is considered to have one digit.
   * @param number: an integer
   * @return number of digits in number, or -1 if number is negative, or 1 if number is zero.
   */
  public int getNumberOfDigitsTwo(int number) {
    // Write your code here

    if (number < 0) {
      return -1;
    }
    if (number == 0) {
      return 1;
    }

    String result = Integer.toString(number);
    return result.length();
  }

  public int getSumOfDigits(int number) {
    // Write your code here
    if (number < 0) {
      return -1;
    }
    if (number == 0) {
      return 0;
    }
    int sum = 0;
    while (number >= 1) {
      int result = number % 10;
      number /= 10;
      sum += result;
    }
    return sum;
  }

  public int reverseNumber(int number) {
    if (number < 0) {
      return -1;
    }
    if (number == 0) {
      return 0;
    }

    int count = 1;
    int copy = number;
    while (copy / 10 >= 1) {
      copy /= 10;
      count *= 10;
    }

    int reverse = 0;
    while (number >= 1) {
      int result = number % 10;
      number /= 10;
      reverse += result * count;
      count /= 10;
    }
    return reverse;
  }
}

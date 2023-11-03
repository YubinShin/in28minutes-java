package com.in28minutes.arrays;

import java.util.Arrays;

public class ArrayMagic {

  public boolean doesHaveElementGreaterThan(int[] array, int number) {
    if (array.length <= 0) {
      return false;
    }
    for (int item : array) {
      if (item > number) {
        return true;
      }
    }
    return false;
  }

  public static int findSecondLargestElement(int[] array) {
    if (array.length < 2) {
      return -1;
    }
    int maximum = getMaximum(array);
    int result = maximum;
    for (int item : array) {
      if (item < maximum) {
        result = item;
      }
    }
    if (result == getMaximum(array)) {
      return -1;
    }
    return result;
  }

  static int getMaximum(int[] array) {
    Arrays.sort(array);
    return array[array.length - 1];
  }

  public static boolean isSorted(int[] array) {
    if (array.length == 0 || array.length == 1) {
      return true;
    }

    System.out.println("Before sorted: " + Arrays.toString(array));

    int[] copiedArray = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      copiedArray[i] = array[i];
    }

    Arrays.sort(array);

    System.out.println("After sorted: " + Arrays.toString(array));
    System.out.println("Copied: " + Arrays.toString(copiedArray));
    return Arrays.equals(array, copiedArray);
  }

  public static int[] reverseArray(int[] array) {
    if (array.length == 1 || array.length == 0) {
      return array;
    }

    int[] copiedArray = new int[array.length];
    int j = 0;
    for (int i = array.length - 1; i >= 0; i--) {
      copiedArray[j] = array[i];
      System.out.println(
        "copiedArray's index[" + i + "] :" + Arrays.toString(copiedArray)
      );
      j++;
    }
    return copiedArray;
  }
}

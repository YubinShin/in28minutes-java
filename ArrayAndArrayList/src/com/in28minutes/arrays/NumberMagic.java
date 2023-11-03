package com.in28minutes.arrays;

import java.util.ArrayList;
import java.util.List;

public class NumberMagic {

  public static List<Integer> determineAllFactors(int number) {
    ArrayList<Integer> factors = new ArrayList<Integer>();
    if (number == 0) {
      return factors;
    }
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        factors.add(i);
      }
    }
    return factors;
  }

  public List<Integer> determineMultiples(int number, int limit) {
    ArrayList<Integer> multiples = new ArrayList<Integer>();
    if (number <= 0 || number > limit) {
      return multiples;
    }
    for (int i = 1; i < limit; i++) {
      int muti = number * i;
      if (muti < limit) {
        multiples.add(muti);
      }
    }
    return multiples;
  }
}

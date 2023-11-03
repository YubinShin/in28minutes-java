package com.in28minutes.arrays;

import java.util.List;

public class NumberMagicRunner {

  public static void main(String[] args) {
    NumberMagic numberMagic = new NumberMagic();
    List<Integer> factors = NumberMagic.determineAllFactors(6);
    System.out.println(factors);
  }
}

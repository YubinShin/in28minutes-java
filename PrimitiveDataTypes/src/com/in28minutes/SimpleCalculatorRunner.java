package com.in28minutes;

import java.math.BigDecimal;

public class SimpleCalculatorRunner {

  public static void main(String[] args) {
    SimpleInterestCalculator caculator = new SimpleInterestCalculator(
      "4500.00",
      "7.5"
    );

    BigDecimal totalValue = caculator.calculateTotalValue(5);
    System.out.println(totalValue);
  }
}

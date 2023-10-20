package com.in28minutes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

  BigDecimal principal;
  BigDecimal interest;

  SimpleInterestCalculator(String principal, String interest) {
    this.principal = new BigDecimal(principal);
    this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
  }

  public BigDecimal calculateTotalValue(int year) {
    return (
      this.principal.add(
          this.principal.multiply(this.interest.multiply(new BigDecimal(year)))
        )
    );
  }
}

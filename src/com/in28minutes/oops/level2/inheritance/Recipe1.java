package com.in28minutes.oops.level2.inheritance;

public class Recipe1 extends AbstractRecipe {

  @Override
  void getReady() {
    System.out.println("Get the raw Metarials");
    System.out.println("Get the Utensils");
  }

  @Override
  void doDishUp() {
    System.out.println("Prepare the dish");
  }

  @Override
  void cleanUp() {
    System.out.println("Clean up the Utensils");
  }
}

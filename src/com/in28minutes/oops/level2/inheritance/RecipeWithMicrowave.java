package com.in28minutes.oops.level2.inheritance;

public class RecipeWithMicrowave extends AbstractRecipe {

  @Override
  void getReady() {
    System.out.println("Get the raw Metarials");
    System.out.println("Switch on the Microwave");
  }

  @Override
  void doDishUp() {
    System.out.println("Get stuff ready");
    System.out.println("Put it in the microwave");
  }

  @Override
  void cleanUp() {
    System.out.println("Clean up the Utensils");
    System.out.println("Switch off the Microwave");
  }
}

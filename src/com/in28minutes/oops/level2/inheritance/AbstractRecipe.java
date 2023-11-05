package com.in28minutes.oops.level2.inheritance;

public abstract class AbstractRecipe {

  // 이런 상황에서 추상클래스는 매우매우 쓸모 있습니다.
  // 요리과정
  public void execute() {
    System.out.println("-----------------------");
    getReady();
    doDishUp();
    cleanUp();
    System.out.println("-----------------------");
    // 저는 안에 메소드들과 관련되고 싶지 않습니다.
    // 그냥 요리마다 알아서 하게 만들고 싶죠
  }

  // 준비하기 prepare
  abstract void getReady();

  // 요리하기 recipe
  abstract void doDishUp();

  // 청소하기 cleanup
  abstract void cleanUp();
}

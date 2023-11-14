package com.in28minutes.collections;

import java.util.HashSet;
import java.util.Set;

public class IntroduceSet {

  public static void main(String[] args) {
    Set<String> set = Set.of("Apple", "Banana", "Cat");
    // set.add("Apple"); 불변자료형이라서 안 된다
    HashSet<String> hashSet = new HashSet<>(set);
    // hashSet.add(2, "Apple"); set 에서는 위치를 기반한 추가나 제거가 안된다

    /**
     * Set 의 중요한 점
     * 1. 순서가 없다.
     * 2. 중복을 허용하지 않는다. (유일한 값을 저장하는데 쓰인다) */

  }
}

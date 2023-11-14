package com.in28minutes.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PracticeSetHashSet {

  public static void main(String[] args) {
    Set<Integer> numbers = new HashSet<>();
    numbers.add(765432);
    numbers.add(76543);
    numbers.add(7654);
    numbers.add(765);
    numbers.add(76);
    // 삽입순서나 정렬순서는 신경쓰지 않습니다
    // numbers ==> [765432, 7654, 76, 765, 76543]

    Set<Integer> linkedNumbers = new LinkedHashSet<>();
    linkedNumbers.add(765432);
    linkedNumbers.add(76543);
    linkedNumbers.add(7654);
    linkedNumbers.add(765);
    linkedNumbers.add(76);
    // linkedNumbers ==> [765432, 76543, 7654, 765, 76]
    // 삽입한 순서대로 저장됩니다.

    Set<Integer> treeNumber = new TreeSet<>();
    treeNumber.add(765432);
    treeNumber.add(76543);
    treeNumber.add(7654);
    treeNumber.add(765);
    treeNumber.add(76);
    // treeNumber ==> [76, 765, 7654, 76543, 765432]
    // 정렬된 순서로 저장됩니다.

    List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
    Set<Character> hashCharacter = new HashSet<>(characters);
    Set<Character> linkedHashCharacter = new LinkedHashSet<>(characters);
    Set<Character> treeCharacter = new TreeSet<>(characters);
    System.out.println(hashCharacter); // 삽입순서, 정렬에 상관없이
    System.out.println(linkedHashCharacter); // 삽입순서에 따라
    System.out.println(treeCharacter); // 정렬에 따라
    // UNIQUE 라는 말을 들으면 set 이 자동으로 떠올라야합니다.

    /**
     *
     * HashSet, LinkedSet 의 메서드들은 Collection 과 완벽히 일치합니다.
     *
     * TreeSet 은 정렬된 상태라서 쓸 수 있는 메서드가 몇개 더 제공됩니다.
     * TreeSet이 NavigatedSet 인터페이스를 구현하기 때문에 아래 메서드들을 쓸 수 있습니다.
     */

    TreeSet<Integer> treeSetNumbers = new TreeSet<>(Set.of(65, 54, 34, 12, 99));
    System.out.println(treeSetNumbers);
    // 매개변수보다 같거나 작은 걸 찾아준다
    System.out.println(treeSetNumbers.floor(34));
    // 매개변수보다 작은 걸 찾아준다
    System.out.println(treeSetNumbers.lower(34));
    // 매개변수보다 같거나 큰 걸 찾아준다
    System.out.println(treeSetNumbers.ceiling(34));
    // 매개변수보다 큰 걸 찾아준다
    System.out.println(treeSetNumbers.higher(34));
    // 인자 사이에 있는 걸 찾아준다
    System.out.println(treeSetNumbers.subSet(20, 80));
    // 인자와 같거나 사이에 있는 걸 찾아준다
    System.out.println(treeSetNumbers.subSet(20, true, 80, true));
    // 인자와 같거나 사이에 있는 걸 찾아준다
    System.out.println(treeSetNumbers.subSet(20, true, 80, false));

    //
    System.out.println(treeSetNumbers.headSet(50));
    System.out.println(treeSetNumbers.tailSet(50));
  }
}

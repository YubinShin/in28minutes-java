package com.in28minutes.collections;

import java.util.Map;
import java.util.NavigableMap;

public class PracticeMap {

  /**
   * Map 의 가장 중요한 부분은
   * Collection 프레임워크의 일부분이면서,
   * Collection 인터페이스를 구현하지 않는다는 겁니다.
   *
   * key-value 값을 저장하는데 사용합니다.
   */
  public static void main(String[] args) {}

  // 면접에서 많이 묻는 HashTable, HashMap
  // 공통점 :
  // 연산할땐 HashTable, HashMap 이 별차이가 없습니다.
  // 순서가 없습니다. (unsorted, unordered)
  //
  // 차이점 :
  // HashMap 은 Key를 null 값과 저장할 수 있게 해준다는 겁니다.

  class HashMap implements Map {
    // HashMap은 Hashtable을 기반으로 하지만, 그 자체로는 Hashtable의 데이터 구조를 사용하지 않습니다. HashMap은 내부적으로 해시 테이블을 사용하지만, Hashtable 클래스와는 별개입니다.
    // HashTable 구조이기 때문에 (unsorted, unordered)
    // Key's hashCode() 가 사용됩니다.
    // null 키나 값이 허용됩니다.
  }

  class HashTable implements Map {
    // Syncronized - HashMap 의 Thread Safe 버전입니다.
    // 모든 메소드가 동기화 되어있습니다.
    // unsorted, unordered
    // Key's hashCode() 가 사용됩니다.
    // null 키나 값이 허용되지 않습니다.

  }

  class LinkedHashMap implements Map {
    // unsorted, Ordered (삽입순서가 유지됩니다)
    // 정렬되어있지 않기때문에 HashMap 에 비해서 삽입과 제거가 조금 느립니다.
    // 하지만 요소끼리 연결되어있기 때문에 Iteration 에는 빠릅니다.
    // Key's hashCode() 가 사용됩니다.
  }

  class TreeMap implements Map, NavigableMap {
    // Tree 데이터구조를 가지기 때문에 정렬되어 있고,
    // Map 에 있는 인터페이스뿐만 아니라 NavigableMap 의 메서드도 쓸 수 있습니다.
    //TreeMap은 Map 인터페이스와 NavigableMap 인터페이스를 구현합니다. 이것은 키가 정렬된 순서로 유지되는 레드-블랙 트리 기반의 맵입니다.
    // TreeMap은 키에 대해 자연 순서 또는 생성자에 제공된 Comparator에 따라 정렬합니다.
  }
}

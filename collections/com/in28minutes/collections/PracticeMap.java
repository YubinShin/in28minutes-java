package com.in28minutes.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PracticeMap {

  public static void main(String[] args) {
    // Map<String, Integer> map = introduceMapMethod();
    // getHashMap(map);

    // getNewHashMap();
    // getLinkedHashMap();
    // getTreeMap();

    // practice("This is a great thing");

    introduceNavigableMap();
  }

  private static void getHashMap(Map<String, Integer> map) {
    Map<String, Integer> hashMap = new HashMap<>(map);
    hashMap.put("F", 5); // 원래 값이 없었기 때문에 null 을 반환합니다.
    hashMap.put("Z", 11); // 원래 있던 Z의 값이 바뀌고 원래 값을 반환합니다.
  }

  private static Map<String, Integer> introduceMapMethod() {
    Map<String, Integer> map = Map.of("A", 3, "B", 5, "Z", 10);
    System.out.println(map);
    // map.put("Z");// 불변이라서 에러
    map.get("Z");
    map.get("A");
    map.get("B");
    System.out.println(map.size());
    System.out.println(map.isEmpty());
    System.out.println(map.containsKey("A"));
    System.out.println(map.containsValue(3));
    System.out.println(map.keySet()); // 데이터구조와 키만 가져옵니다
    System.out.println(map.values());
    return map;
  }

  private static void getNewHashMap() {
    HashMap<String, Integer> newHashMap = new HashMap<>();
    newHashMap.put("Z", 5);
    newHashMap.put("A", 15);
    newHashMap.put("F", 25);
    newHashMap.put("L", 250);
    System.out.println(newHashMap);
    // {A=15, F=25, Z=5, L=250}
    // 정렬순서와 삽입순서를 둘 다 잃어버립니다.
    // 하지만 순서가 상관없기 때문에 다른 Map 분류에 비해 효율적입니다.
  }

  private static void getLinkedHashMap() {
    LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
    linkedHashMap.put("F", 25);
    linkedHashMap.put("A", 15);
    linkedHashMap.put("Z", 5);
    linkedHashMap.put("L", 250);
    System.out.println(linkedHashMap);
    // {Z=5, A=15, F=25, L=250}
    // 삽입 순서와 관련이 있습니다.
  }

  private static void getTreeMap() {
    TreeMap<String, Integer> treeMap = new TreeMap<>();
    treeMap.put("F", 25);
    treeMap.put("A", 15);
    treeMap.put("Z", 5);
    treeMap.put("L", 250);
    System.out.println(treeMap);
    // {A=15, F=25, L=250, Z=5}
    // 자연스럽게 정렬됩니다
  }

  public static void practice(String input) {
    String[] charArray = input.split("");
    String[] wordsArray = input.split(" ");
    TreeMap<String, Integer> charMap = new TreeMap<>();
    TreeMap<String, Integer> wordsMap = new TreeMap<>();

    for (String cha : charArray) {
      charMap.put(cha, charMap.getOrDefault(cha, 0) + 1);
    }

    for (String word : wordsArray) {
      wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
    }

    System.out.println("charMap :" + charMap);
    System.out.println("wordsMap : " + wordsMap);
  }

  public static void introduceNavigableMap() {
    TreeMap<String, Integer> treeMap = new TreeMap<>();
    treeMap.put("F", 25);
    treeMap.put("A", 15);
    treeMap.put("Z", 5);
    treeMap.put("L", 250);
    treeMap.put("B", 25);
    treeMap.put("G", 25);
    System.out.println(treeMap);
    System.out.println(treeMap.higherKey("B")); // 더 큰 값을 반환합니다
    System.out.println(treeMap.ceilingKey("C")); // 같거나 더 큰 값을 반환합니다
    System.out.println(treeMap.lowerKey("C"));
    System.out.println(treeMap.floorKey("C"));
    System.out.println(treeMap.firstEntry());
    System.out.println(treeMap.lastEntry());
    System.out.println(treeMap.subMap("C", "Y"));
    System.out.println(treeMap.subMap("B", true, "Z", true));
  }
  /**
   * Map 의 가장 중요한 부분은
   * Collection 프레임워크의 일부분이면서,
   * Collection 인터페이스를 구현하지 않는다는 겁니다.
   *
   * key-value 값을 저장하는데 사용합니다.
   */
  // 면접에서 많이 묻는 HashTable, HashMap
  // 공통점 :
  // 연산할땐 HashTable, HashMap 이 별차이가 없습니다.
  // 순서가 없습니다. (unsorted, unordered)
  //
  // 차이점 :
  // HashMap 은 Key를 null 값과 저장할 수 있게 해준다는 겁니다.

  //   class HashMap implements Map {
  //     // HashMap은 Hashtable을 기반으로 하지만, 그 자체로는 Hashtable의 데이터 구조를 사용하지 않습니다. HashMap은 내부적으로 해시 테이블을 사용하지만, Hashtable 클래스와는 별개입니다.
  //     // HashTable 구조이기 때문에 (unsorted, unordered)
  //     // Key's hashCode() 가 사용됩니다.
  //     // null 키나 값이 허용됩니다.
  //   }

  //   class HashTable implements Map {
  //     // Syncronized - HashMap 의 Thread Safe 버전입니다.
  //     // 모든 메소드가 동기화 되어있습니다.
  //     // unsorted, unordered
  //     // Key's hashCode() 가 사용됩니다.
  //     // null 키나 값이 허용되지 않습니다.

  //   }

  //   class LinkedHashMap implements Map {
  //     // unsorted, Ordered (삽입순서가 유지됩니다)
  //     // 정렬되어있지 않기때문에 HashMap 에 비해서 삽입과 제거가 조금 느립니다.
  //     // 하지만 요소끼리 연결되어있기 때문에 Iteration 에는 빠릅니다.
  //     // Key's hashCode() 가 사용됩니다.
  //   }

  //   class TreeMap implements Map, NavigableMap {
  //     // Tree 데이터구조를 가지기 때문에 정렬되어 있고,
  //     // Map 에 있는 인터페이스뿐만 아니라 NavigableMap 의 메서드도 쓸 수 있습니다.
  //     // TreeMap은 Map 인터페이스와 NavigableMap 인터페이스를 구현합니다. 이것은 키가 정렬된 순서로 유지되는 레드-블랙 트리 기반의 맵입니다.
  //     // TreeMap은 키에 대해 자연 순서 또는 생성자에 제공된 Comparator에 따라 정렬합니다.
  //   }
}

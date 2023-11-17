package com.in28minutes.functionalprogramming;

public class Optional {

  /**
   * 먼저 옵셔널에서 제가 소개할 중요한 메소드와 정확히 어느 때 옵셔널을 사용할 수 있을지 알아보겠습니다
   * 옵셔널은 Java 8에서 새로 소개된 기능 중 하나입니다
   * 'null pointer exceptions', 즉 '널 포인터 예외'라는 오류를 피하고자 사용하죠
   *
   * 일반적으로, 다양한 값들을 리스트로 가지고 있고 이 자료들에 접근하려고 할 때.
   * 만약 마지막에 결과로 아무 일도 일어나지 않는다면 보통 'null' 값이 환원된 것입니다
   * 이때 API의 사용자들은 null 값이 환원됐다는 사실을 알지 못하죠
   * 그러므로 object() 함수를 사용하는 대신, 옵셔널로 값을 환원받을 수 있습니다
   * */
  public static void main(String[] args) {}
  // 스트림은 옵셔널을 반환한다.
  // NULL 이 나올경우를 대비해서 orElse(0) 처럼 기본값을 설정해줄 수 있다.
}
// Step 12: The Optional<T> class
// In an earlier section, we wrote and ran the following code:
// 	jshell> List.of(23, 12, 34, 53).stream().max((n1, n2) -> Integer.compare(n1, n2));
// 	Optional[53]
// 	jshell>
// In order to get the result in a form you would appreciate, we modified this code to look like:
// jshell> List.of(23, 12, 34, 53).stream().max((n1, n2) -> Integer.compare(n1, n2)).get();
// 53
// jshell>
// max() is a stream operation, that needs to consume a stream. It is possible that the input stream is empty. In that case, the maximum value would be null. It is undesirable in FP to encounter an exception during a stream operation. It is extremely inelegant if we are asked to handle an exception in an FP code pipeline.
// The Optional<T> class was introduced in Java SE 8, as a lifeline in such situations. It covers the possibility of absence of (or null) result from a terminal stream operation. The following example illustrates how you can query, and access the result from, an Optional<T> object.
// 	jshell> List.of(23, 45, 67, 12).stream().filter(num -> num % 2 == 0).max( (n1, n2) -> 	Integer.compare(n1, n2) )
// 	$1 ==> Optional[12]
// 	jshell> $1.get()
// 	$2 ==> 12
// 	jshell> $1.isPresent()
// 	$3 ==> true
// In case the result is empty, then the value stored in the result is not null, it is Optional.empty.
// 	jshell> List.of(23, 45, 67).stream().filter(num -> num % 2 == 0).max( (n1, n2) -> 	Integer.compare(n1, n2) )
// 	$4 ==> Optional.empty
// 	jshell> $4.isPresent()
// 	$5 ==> false
// 	jshell> $4.orElse(0)
// 	$6 ==> 0
// You can provide a default value for the result using the method orElse().
// 	jshell> List.of(23, 45, 67).stream().filter(num -> num % 2 == 0).max( (n1, n2) -> 	Integer.compare(n1, n2) ).orElse(0)
// 	$7 ==> 0
// 	jshell> List.of(23, 45, 67, 34).stream().filter(num -> num % 2 == 0).max( (n1, n2) -> 	Integer.compare(n1, n2) ).orElse(0)
// 	$8 ==> 34
// 	jshell>

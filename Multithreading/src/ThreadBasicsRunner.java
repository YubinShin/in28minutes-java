// 스레드를 생성하는 법 2가지
// 1. extends Thread (스레드라고 불리는 클래스를 확장하는 것)
// 2. implements Runnable(Runnable 이라는 인터페이스를 구현하는 것)

class Task1 extends Thread {

  public void run() { // SIGNATURE 정확히 적어야해용
    System.out.println("\nTask1 Started");
    for (int i = 101; i <= 199; i++) {
      System.out.print(i + " ");
    }
    System.out.print("\nTask1 Done");
  }
}

class Task2 implements Runnable {

  @Override
  public void run() {
    System.out.println("\nTask2 Started");
    for (int i = 201; i <= 299; i++) {
      System.out.print(i + " ");
    }
    System.out.print("\nTask2 Done");
  }
}

public class ThreadBasicsRunner {

  public static void main(String[] args) {
    // Task1
    System.out.println("\nTask1 Kicked Up");
    Task1 task1 = new Task1();
    task1.start(); // task1.run(); // run 이라고 적으면 안되고 start 를 실행해야해요.

    // Task2
    /**
     * runnable 인터페이스를 구현했다면 Thread라는 클래스를 또 만들어야합니다.
     * task2 는 메인 프로그램의 실행이 완료된 후에도 실행되고 있죠?
     */
    System.out.println("\nTask2 Kicked Up");
    Task2 task2 = new Task2();
    Thread task2Thread = new Thread(task2);
    task2Thread.start();

    // Task3
    System.out.println("\nTask3 Kicked Up");
    for (int i = 301; i <= 399; i++) {
      System.out.print(i + " ");
    }
    System.out.print("\nTask3 Done");

    System.out.print("\nMain Done");
  }
}

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

  public static void main(String[] args) throws InterruptedException {
    // Task1
    System.out.println("\nTask1 Kicked Up");
    Task1 task1 = new Task1();
    task1.setPriority(1);
    task1.start();

    // Task2
    System.out.println("\nTask2 Kicked Up");
    Task2 task2 = new Task2();
    Thread task2Thread = new Thread(task2);
    task2Thread.setPriority(10);
    task2Thread.start();

    // task1이 끝나기를 기다려주기
    task1.join(); // 1) 얘가 끝나야
    task2Thread.join();

    // Task3
    System.out.println("\nTask3 Kicked Up"); // 2) 얘가 실행가능

    for (int i = 301; i <= 399; i++) {
      System.out.print(i + " ");
    }
    System.out.print("\nTask3 Done");

    System.out.print("\nMain Done");
  }
}

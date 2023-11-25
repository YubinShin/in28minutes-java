import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

  public static void main(String[] arg) {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    // executorService 는 어느 시점이든 하나의 작업만 수행가능합니다.
    executorService.execute(new Task1());
    executorService.execute(new Thread(new Task2()));

    // Task3
    System.out.println("\nTask3 Kicked Up");
    for (int i = 301; i <= 399; i++) {
      System.out.print(i + " ");
    }
    System.out.print("\nTask3 Done");
    System.out.print("\nMain Done");

    executorService.shutdown(); // 중요
  }
}

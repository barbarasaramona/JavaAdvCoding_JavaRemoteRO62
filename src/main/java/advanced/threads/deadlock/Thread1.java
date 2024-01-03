package advanced.threads.deadlock;

import java.util.Arrays;
import java.util.List;

public class Thread1 implements Runnable {
  Chat thread1Chat;
  ShowMsg thread1Show;
  List<String> questions = Arrays.asList("Hi !", "How are you ?", "I am also doing fine.");

  public Thread1(Chat thread1Chat, ShowMsg thread1Show) {
    this.thread1Chat = thread1Chat;
    this.thread1Show = thread1Show;
    new Thread(this, "Thread 1").start();
  }

  @Override
  public void run() {
    for (String x : questions) {
      String msg = "(" + Thread.currentThread().getName() + ") " + x;
      thread1Show.show(msg, thread1Chat, ShowMsg.AS_QUESTION);
      try {
        Thread.sleep(10);
      }
      catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}

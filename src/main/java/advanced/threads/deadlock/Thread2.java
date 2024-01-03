package advanced.threads.deadlock;

import java.util.Arrays;
import java.util.List;

public class Thread2 implements Runnable {
  Chat thread2Chat;
  ShowMsg thread2Show;
  List<String> answers = Arrays.asList("Hi !", "I am good, what about you ?", "Great !");

  public Thread2(Chat thread2Chat, ShowMsg thread2Show) {
    this.thread2Chat = thread2Chat;
    this.thread2Show = thread2Show;
    new Thread(this, "Thread 2").start();
  }

  @Override
  public void run() {
    for (String x : answers) {
      String msg = "(" + Thread.currentThread().getName() + ") " + x;
      thread2Show.show(msg, thread2Chat, ShowMsg.AS_ANSWER);
      try {
        Thread.sleep(10);
      }
      catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}

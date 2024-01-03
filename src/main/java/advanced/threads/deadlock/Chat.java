package advanced.threads.deadlock;

public class Chat {
  boolean isQuestionAsked = false;

  public synchronized void question(String msg) {
    System.out.println("question() " + Thread.currentThread().getName());
    while (isQuestionAsked) {
      try {
        System.out.println("  Waiting...");
        wait();
      }
      catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    System.out.println(msg);
    isQuestionAsked = true;
    notify();
  }

  public synchronized void answer(String msg) {
    System.out.println("answer() " + Thread.currentThread().getName());
    while (!isQuestionAsked) {
      try {
        System.out.println("  Waiting...");
        wait();
      }
      catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    System.out.println(msg);
    isQuestionAsked = false;
    notify();
  }
}

package advanced.threads.deadlock;

public class ShowMsg {
  public static final boolean AS_QUESTION = true;
  public static final boolean AS_ANSWER = false;

  public synchronized void show(String msg, Chat chat, boolean isQuestion) {
    System.out.println("show() " + Thread.currentThread().getName());
    if (isQuestion) {
      chat.question(msg);
    }
    else {
      chat.answer(msg);
    }
  }
}

package advanced.threads.deadlock;

public class Main {
  public static void main(String[] args) {
    Chat chat = new Chat();
    ShowMsg showMsg = new ShowMsg();
    new Thread1(chat, showMsg);
    new Thread2(chat, showMsg);
  }
}

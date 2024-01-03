package advanced.threads;

public class Main {
  public static void main(String[] args) {
    Chat chat = new Chat();
    new Thread1(chat);
    new Thread2(chat);
  }
}

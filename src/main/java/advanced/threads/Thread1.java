package advanced.threads;

import java.util.*;

public class Thread1 implements Runnable {
    Chat thread1Chat;
    List<String> questions = Arrays.asList("Hi", "How are you?", "I am also doing fine");

    public Thread1(Chat thread1Chat) {
        this.thread1Chat = thread1Chat;
        new Thread(this, "thread1").start();
    }

    @Override
    public void run() {
        for (String x: questions) {
            thread1Chat.question("thread1: " + x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

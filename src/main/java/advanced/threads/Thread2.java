package advanced.threads;

import java.util.*;

public class Thread2 implements Runnable {
    Chat thread2Chat;
    List<String> answers = Arrays.asList("Hi", "I am good, what about you?", "Great");
    public Thread2(Chat thread2Chat) {
        this.thread2Chat = thread2Chat;
        new Thread(this, "thread2").start();
    }

    @Override
    public void run() {
        for (String x: answers) {
            thread2Chat.answer("thread2: " + x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

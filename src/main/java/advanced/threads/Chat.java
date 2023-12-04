package advanced.threads;

public class Chat {
    boolean isQuestionAsked = false;
    public synchronized void question(String msg) {
        if (isQuestionAsked) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(msg);
        isQuestionAsked = true;
        notify();
    }
    public synchronized void answer(String msg) {
        if (isQuestionAsked) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(msg);
        isQuestionAsked = false;
        notify();
    }
}
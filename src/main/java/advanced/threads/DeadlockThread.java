package advanced.threads;

public class DeadlockThread {
    public static Object firstObject = new Object();
    public static Object secondObject = new Object();

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            synchronized (firstObject) {
                System.out.println("Thread1 - first object blocked");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread1 - waiting for second object");
                synchronized (secondObject) {
                    System.out.println("Thread1 - first + second object blocked");
                }
                System.out.println("Thread1 - second object freed");
            }
        }
    }
    public static class Thread2 extends Thread {
        @Override
        public void run() {
            synchronized (firstObject) {
                System.out.println("Thread2 - first object blocked");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread2 - waiting for second object");
                synchronized (secondObject) {
                    System.out.println("Thread2 - second + first object blocked");
                }
                System.out.println("Thread 2 - second object freed");
            }
        }
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();

        Thread2 thread2 = new Thread2();
        thread2.start();
    }
}

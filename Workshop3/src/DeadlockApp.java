import java.util.LinkedList;

public class DeadlockApp {
    public static void main(String[] args) throws InterruptedException {

        final PC pc = new PC();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Producer");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Consumer");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    public static class PC {
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;

        public synchronized void produce() throws InterruptedException {
            while (true) {
                if (list.size() == capacity) {
                    wait();
                }
                list.add(0);
                System.out.println(Thread.currentThread().getName() + ": Added to buffer!");
                notify();
            }
        }

        public synchronized void consume() throws InterruptedException {
            while (true) {
                if (list.size() == 0) {
                    wait();
                }
                list.pop();
                System.out.println(Thread.currentThread().getName() + ": Removed from buffer!");
                notify();
            }
        }
    }
}

public class InterruptThread implements Runnable {

    public InterruptThread() {
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println(Thread.currentThread().getName() + ": Working...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

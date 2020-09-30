public class ThreadApp {
    public static void main(String[] args) throws Exception {
        final Counter counter = new Counter();

        System.out.println("Current thread: " + Thread.currentThread().getName());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.inc();
                    System.out.println("Value on current thread iteration: " + counter.getValue());
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.dec();
                    System.out.println("Value on current thread iteration: " + counter.getValue());
                }
            }
        });

        t1.start();
        t2.start();
    }
}

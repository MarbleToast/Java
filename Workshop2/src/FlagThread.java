public class FlagThread extends Thread {
    private volatile boolean done = false;

    public FlagThread() {

    }

    public void run() {
        while (!done) {
            System.out.println(this.getName() + ": Working...");
            try {
                Thread.sleep(10);
                System.out.println(this.getName() + ": Ending sleep");
            } catch (InterruptedException e) {
            }
        }
    }

    public void stopThread() {
        System.out.println(this.getName() + ": Setting flag");
        this.done = true;
    }

}

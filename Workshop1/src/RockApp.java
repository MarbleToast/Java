public class RockApp {
    /*
     * public static void main(String[] args) { UggRock rock1 = new
     * UggRock(UggRockType.GRANITE, UggRockSize.MEDIUM);
     * System.out.println(rock1.rockValue()); }
     */

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    Ugg.UggRock rock1 = Ugg.drawRock();
                    System.out
                            .println(Thread.currentThread().getName() + ": " + rock1 + ", value: " + rock1.rockValue());
                }
            }
        }, "Ugg 1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    Ugg.UggRock rock1 = Ugg.drawRock();
                    System.out
                            .println(Thread.currentThread().getName() + ": " + rock1 + ", value: " + rock1.rockValue());
                }
            }
        }, "Ugg 2");

        t1.start();
        t2.start();

    }
}

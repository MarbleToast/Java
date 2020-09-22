public class App {
    /*
     * public static void main(String[] args) { UggRock rock1 = new
     * UggRock(UggRockType.GRANITE, UggRockSize.MEDIUM);
     * System.out.println(rock1.rockValue()); }
     */

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Ugg.UggRock rock1 = Ugg.drawRock();
            System.out.println(rock1 + ", value: " + rock1.rockValue());
        }

    }
}

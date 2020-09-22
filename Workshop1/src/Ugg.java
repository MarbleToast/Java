import java.util.Random;

public class Ugg {

    enum UggRockType {
        GRANITE(7), OBSIDIAN(20), PUMICE(2), LAVA(15);

        private short multiplierValue;

        private UggRockType(int value) {
            multiplierValue = (short) value;
        }

        public short getMultiplierValue() {
            return multiplierValue;
        }
    }

    enum UggRockSize {
        LARGE(5), MEDIUM(3), SMALL(1);

        private short multiplierValue;

        private UggRockSize(int value) {
            multiplierValue = (short) value;
        }

        public short getMultiplierValue() {
            return multiplierValue;
        }
    }

    static class UggRock {
        private UggRockSize rockSize;
        private UggRockType rockType;

        public UggRock(UggRockType type, UggRockSize size) {
            rockSize = size;
            rockType = type;
        }

        public UggRockSize getRockSize() {
            return rockSize;
        }

        public UggRockType getRockType() {
            return rockType;
        }

        public int rockValue() {
            return rockSize.getMultiplierValue() * rockType.getMultiplierValue();
        }

        public String toString() {
            String prettyPrint = "";

            switch (rockSize) {
                case LARGE:
                    prettyPrint += "Bigun";
                    break;
                case MEDIUM:
                    prettyPrint += "Quite-bigun";
                    break;
                case SMALL:
                    prettyPrint += "Not-so-bigun";
                    break;
            }

            prettyPrint += " ";

            switch (rockType) {
                case GRANITE:
                    prettyPrint += "speckily";
                    break;
                case LAVA:
                    prettyPrint += "hot-hot-hot";
                    break;
                case OBSIDIAN:
                    prettyPrint += "ouchy-black";
                    break;
                case PUMICE:
                    prettyPrint += "floaty";
                    break;
            }
            return prettyPrint;
        }

    }

    public static UggRock drawRock() {
        Random r = new Random();

        UggRockType type = UggRockType.values()[r.nextInt(UggRockType.values().length)];
        UggRockSize size;

        int rng = r.nextInt(9);

        if (rng == 0) {
            size = UggRockSize.LARGE; // 1 in 9
        } else if (rng > 0 && rng < 3) {
            size = UggRockSize.MEDIUM; // 2 in 9 (2 * 1 in 9)
        } else {
            size = UggRockSize.SMALL; // 2 in 3 (3 * 2 in 9)
        }

        return new UggRock(type, size);

    }

}

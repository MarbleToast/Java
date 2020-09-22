public class UggRock {

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

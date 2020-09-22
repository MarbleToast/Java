public enum UggRockType {

    GRANITE(7), OBSIDIAN(20), PUMICE(2), LAVA(15);

    private short multiplierValue;

    private UggRockType(int value) {
        multiplierValue = (short) value;
    }

    public short getMultiplierValue() {
        return multiplierValue;
    }
}

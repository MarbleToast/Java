public enum UggRockSize {
    LARGE(5), MEDIUM(3), SMALL(1);

    private short multiplierValue;

    private UggRockSize(int value) {
        multiplierValue = (short) value;
    }

    public short getMultiplierValue() {
        return multiplierValue;
    }
}

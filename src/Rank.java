public enum Rank {
    LevelOneSupporter (0),
    LevelTwoSupporter (1),
    Manager (2);

    private int value;

     Rank(int v) {
        value = v;
    }

    public int getValue() {
        return value;
    }
}
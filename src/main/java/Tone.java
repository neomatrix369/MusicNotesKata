public enum Tone {
    FLAT("Flat", "b"),
    NORMAL("Normal", ""),
    SHARP("Sharp", "#");
    private final String notation;
    private final String name;

    Tone(String name, String notation) {
        this.name = name;
        this.notation = notation;
    }

    @Override
    public String toString() {
        return name;
    }

    public String toNotation() {
        return notation;
    }

}

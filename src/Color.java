public enum Color {
    Y,
    R,
    NULL;

    public boolean isNull() {
        return this == Color.NULL;
    }

    public static Color getColor(int num) {
        return Color.values()[num];
    }
}

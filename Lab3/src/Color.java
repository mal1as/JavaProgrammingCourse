public enum Color {
    RED("Красный"),
    BLUE("Голубой"),
    BLAKE("Чёрный"),
    PINK("Розовый"),
    WHITE("Белый"),
    GREEN("Зелёный"),
    PURPLE("Фиолетовый");

    private String russian;

    String getRussian() {
        return russian;
    }

    Color(String russian) {
        this.russian = russian;
    }
}

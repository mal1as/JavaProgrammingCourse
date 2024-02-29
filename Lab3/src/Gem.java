public enum Gem {
    RUBY("Рубин"),
    GARNET("Гранат"),
    CRYSTAL("Хрусталь");
    private String russian;

    Gem(String russian) {
        this.russian = russian;
    }

    String getRussian() {
        return russian;
    }
}

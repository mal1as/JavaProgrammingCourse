public enum BagType {
    BACKPACK("Рюкзак"),
    CASE("Чемодан"),
    LADY_BAG("Женская сумочка");

    private String russian;

    BagType(String russian) {
        this.russian = russian;
    }

    String getRussian() {
        return russian;
    }
}

public enum Condition {
    REST("отдыхает"),
    SLEEP("спит"),
    THINK("думает"),
    NOTICE("внимательно смотрит на что-то"),
    NOTHING("ничего не делает"),
    STAND("Стоит"),
    IN_ARRIVE("В путешествии"),
    SIT_ON_ANIMAL("Сидит на животном"),
    READY_FOR_ARRIVE("Готовится к путешествию");
    private String russian;

    Condition(String russian) {
        this.russian = russian;
    }

    public String getRussian() {
        return russian;
    }
}

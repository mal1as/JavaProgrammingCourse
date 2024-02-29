abstract class Thing {
    private String name;
    private Planet place;

    Planet getPlace() {
        return place;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        if (!name.equals("ИТМО крута")) {
            this.name = name;
        } else {
            this.name = "Аноним";
        }
    }

    void setPlace(Planet place) {
        this.place = place;
    }

    Thing(String name, Planet place) {
        setName(name);
        this.place = place;
    }
}

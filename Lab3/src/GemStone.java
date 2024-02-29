public class GemStone extends Stone {
    private Gem type;
    private boolean spark;   //сверкает ли?

    GemStone(String name, Planet place, int age, int size, Gem type) {
        super(name, place, age, size);
        this.type = type;
    }

    GemStone(String name, Gem type){
        this(name, Planet.EARTH, (int)(Math.random()*10000), 1, type);
    }

    boolean getSpark() {
        return spark;
    }

    Gem getType() {
        return type;
    }

    void setType(Gem type) {
        this.type = type;
    }

    @Override
    public String toString() {
        if (!spark)
            return type.getRussian() + " " + getName() + " стоит на " + getPlace().getRussian() + " уже " + getAge() + " лет. Размер: " + getSize();
        else
            return type.getRussian() + " " + getName() + " стоит на " + getPlace().getRussian() + " уже " + getAge() + " лет и сверкает. Размер: " + getSize();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.hashCode() != obj.hashCode() || this.getClass() != obj.getClass()) {
            return false;
        }
        GemStone gemStone = (GemStone) obj;
        return getName().equals(gemStone.getName()) && getAge() == gemStone.getAge() && getPlace() == gemStone.getPlace() && type == gemStone.type;
    }

    @Override
    public int hashCode() {
        return getName().hashCode() + getPlace().hashCode() + type.hashCode();
    }

    //сверкать
    void sparkle() {
        if (!spark) {
            spark = true;
            System.out.println(getName() + " сверкает. Место: " + getPlace().getRussian());
        } else spark = false;
    }
}

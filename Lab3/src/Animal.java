import java.util.Objects;

public class Animal extends Alive{
    private Color color;
    private int power;
    static final int MAX_POWER = 3;
    static final int MIN_POWER = 0;

    Animal(String name, Planet place, int energy, Color color, int power) {
        super(name, place, energy);
        this.color = color;
        setPower(power);
    }

    void setPower(int power) {
        if (power > MAX_ENERGY) this.power = MAX_POWER;
        else if (power < MIN_POWER) this.power = MIN_POWER;
        else this.power = power;
    }

    int getPower() {
        return power;
    }

    Color getColor() {
        return color;
    }

    void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return power == animal.power &&
                color == animal.color && getName() == animal.getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, power, getName());
    }

    @Override
    public String toString() {
        return "Animal " + getName() + ", цвет: " + color.getRussian() + ", находиться на " + getPlace().getRussian() +
                ". Состояние: " + getCondition().getRussian() + ". Энергия: " + getEnergy();
    }
}

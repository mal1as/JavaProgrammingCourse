abstract class Alive extends Thing implements Rest{
    private Condition condition;
    private int energy;
    final static int MAX_ENERGY = 10;
    final static int MIN_ENERGY = 0;

    Alive(String name, Planet place, int energy) {
        super(name, place);
        this.condition = Condition.NOTHING;
        if (energy > MAX_ENERGY) this.energy = MAX_ENERGY;
        else if (energy < MIN_ENERGY) this.energy = MIN_ENERGY;   //выравнивание энергии по максимальному и минимальному значению
        else this.energy = energy;
    }

    //метод устанавливает состояние и в зав-ти от состояния тратит или поополняет энергию
    void setCondition(Condition condition) {
        switch (condition) {
            case SLEEP:
                addEnergy(3);
                break;
            case REST:
                addEnergy(1);
                break;
            case IN_ARRIVE:
                subEnergy(energy);        //при путешествии тратится вся энергия
                break;
            case STAND:
            case NOTICE:
            case THINK:
                subEnergy(1);
        }
        checkEnergy();
        this.condition = condition;
    }

    //метод выравнивает энергию по максимальному значению, если она больше его
    private void checkEnergy() {
        if (energy > MAX_ENERGY) energy = MAX_ENERGY;
    }

    //метод тратит энергию, если её достаточно
    private void subEnergy(int need) {
        if (energy < need) System.out.println(getName() + " устал. Нужно отдохнуть");
        else {
            energy -= need;
            System.out.println(getName() + " теряет " + need + " энергии");
        }
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит. Место: " + getPlace().getRussian());
        setCondition(Condition.SLEEP);
    }

    @Override
    public void rest() {
        System.out.println(getName() + " отдыхает. Место: " + getPlace().getRussian());
        setCondition(Condition.REST);
    }

    //метод пополняет энергию
    private void addEnergy(int add) {
        if (energy == MAX_ENERGY) System.out.println(getName() + " полон энергии и не хочет отдыхать");
        else {
            energy += add;
            System.out.println(getName() + " восстанавливает " + add + " энергии");
        }
    }

    Condition getCondition() {
        return condition;
    }

    int getEnergy() {
        return energy;
    }

    //метод позволяет переместиться на другую планету
    void goTo(Planet place) {
        //если сущ-во уже на этой планете, то перемещения не будет
        if (place == getPlace()) {
            System.out.println(getName() + " уже находится на планете " + place.getRussian());
            return;
        }
        //если сущ-во готовится к путешествию, то перемещения также не будет
        if(condition==Condition.SIT_ON_ANIMAL || condition==Condition.READY_FOR_ARRIVE){
            System.out.println(getName()+" гтовиться к путешествию, он не может переместиться на "+place);
            return;
        }
        if (condition == Condition.SLEEP || condition == Condition.REST)  //если сущ-во отдыхало, то для начала нужно встать
            setCondition(Condition.STAND);
        if (energy > 2) {
            setPlace(place);
            setCondition(Condition.NOTHING);
            System.out.println(getName() + " перемещается на " + getPlace().getRussian());
        }
        subEnergy(3);
    }

    void stand() {
        if(getCondition()==Condition.SIT_ON_ANIMAL){
            System.out.println("Person "+getName()+" не может встать, т.к. сидит на животном");
            return;
        }
        System.out.println(getName() + " встаёт");
        setCondition(Condition.STAND);
    }

    void tell(String phrase) {
        System.out.println(getName() + " говорит: \"" + phrase + "\"");
    }
}

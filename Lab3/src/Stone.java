abstract class Stone extends Thing {
    private int age;
    private int size;
    final static int MAX_SIZE=100;
    final static int MIN_SIZE=0;

    Stone(String name, Planet place, int age, int size) {
        super(name, place);
        setAge(age);
        setSize(size);
    }

    int getSize() {
        return size;
    }

    void setSize(int size) {
        if (size < MIN_SIZE || size > MAX_SIZE) this.size = (int) (Math.random() * MAX_SIZE);
        else this.size = size;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

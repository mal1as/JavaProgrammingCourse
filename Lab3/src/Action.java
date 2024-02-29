public class Action {
    public static void main(String[] args) {
        //есть сущность Person наследуемая от Alive, он может спать, отдыхать, садиться на животное, говорить, замечать, думать, вставать, перемещаться между планетами
        //у Person есть вложенный класс Bag, туда можно положить ПОЧТИ всё, что угодно, из сумки можно удалять контент и задавать новый
        //также есть статический класс путешествий, он принимает животное, как транспорт, пассажиров(Person), планету нахождения и планету назначения.
        //сущность животное может спать, отдыхать, отправляться в путешествие, и т.д.
        //сущность драгоценный камень может сверкать.
        Person sniff = new Person("Снифф", Planet.MARS, 1, 2);
        GemStone king = new GemStone("Король рубинов", Planet.EARTH, 200, 50, Gem.RUBY);
        Person wizard = new Person("Волшебник", Planet.MOON, 7, 4, "перчатки", "перчатки", "плащ", "шарф", "тёмные очки");
        Animal pant = new Animal("Пантера", Planet.MOON, 3, Color.PINK, 1);
        Person tofsla = new Person("Тофсла");
        Person vifsla = new Person("Вифсла");
        GemStone gemStone1 = new GemStone("Руби", Gem.RUBY);
        GemStone gemStone2 = new GemStone("Хрусти", Gem.CRYSTAL);
        Person.Bag case1 = tofsla.new Bag(BagType.CASE, Color.PURPLE, king);
        Person.Bag backpack1 = wizard.new Bag(BagType.BACKPACK, Color.PINK, gemStone1, gemStone2);
        TimeOfDay.NIGHT.describe("Крайне тёмная земная");
        System.out.println();
        System.out.println("Описание объектов, учавствующих в действии:");
        System.out.println(sniff);
        System.out.println(king);
        System.out.println(wizard);
        System.out.println(pant);
        System.out.println(tofsla);
        System.out.println(vifsla);
        System.out.println(gemStone1);
        System.out.println(gemStone2);
        System.out.println(backpack1);
        System.out.println(case1);
        System.out.println();
        case1.open_closed();
        TimeOfDay.NIGHT.beautifulDescription("Все огни, фонари и даже сама Луна погасли", "завораживающе");
        sniff.sigh();
        sniff.tell("Ну и счастливцы же эти Тофсла и Вифсла!");
        wizard.rest();
        pant.sleep();
        wizard.think(king);
        king.sparkle();
        wizard.notice(king);
        System.out.println(king);
        wizard.tell("Король рубинов! Я искал его не одну сотню лет!");
        wizard.stand();
        wizard.get_dressed();
        backpack1.deleteContent(gemStone1, gemStone2);
        Person.Arrive arrive1 = new Person.Arrive(pant, Planet.MOON, Planet.EARTH, wizard);
        SpaceBody cometa = new SpaceBody() {
            int size = 500;
            Planet planet = Planet.EARTH;

            @Override
            public void startFly() {
                Planet.EARTH.addDensityOfBodiesAroundPlanet(size);
                System.out.println("Вокруг " + planet.getRussian() + " пролетает комета");
            }

            @Override
            public void finishFly() {
                Planet.EARTH.addDensityOfBodiesAroundPlanet(-size);
                System.out.println("От " + planet.getRussian() + " улетела комета");
            }
        };
        SpaceBody many_meteorits = new SpaceBody() {
            int size = 100;
            int number = 2000;
            Planet planet = Planet.EARTH;

            @Override
            public void startFly() {
                Planet.EARTH.addDensityOfBodiesAroundPlanet(size * number);
                System.out.println("Вокруг " + planet.getRussian() + " пролетает большой метеоритный пояс");
            }

            @Override
            public void finishFly() {
                Planet.EARTH.addDensityOfBodiesAroundPlanet(-number * size);
                System.out.println("От " + planet.getRussian() + " улетел огромный метеоритный пояс");
            }
        };
        cometa.startFly();
        many_meteorits.startFly();
        arrive1.go();
        many_meteorits.finishFly();
        arrive1.go();
    }
}
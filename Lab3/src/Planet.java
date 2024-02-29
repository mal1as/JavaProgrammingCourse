public enum Planet {
    EARTH("Земля", 3, 10000),
    MOON("Луна", 3.5, 500),
    MARS("Марс", 4, 5000);
    private String russian;
    private double number_to_sun;
    private int size;
    private double densityOfBodiesAroundPlanet; //плотность космических тел вокруг планеты

    Planet(String russian, double number_to_sun, int size) {
        this.russian = russian;
        this.number_to_sun = number_to_sun;
        this.size=size;
        this.densityOfBodiesAroundPlanet=0;
    }

    //вычисялем коэффициент опасности путешествия
    double getLevelOfDanger(){
        return densityOfBodiesAroundPlanet/size;
    }

    void addDensityOfBodiesAroundPlanet(double densityOfBodiesAroundPlanet) {
        this.densityOfBodiesAroundPlanet += densityOfBodiesAroundPlanet;
    }

    double getDensityOfBodiesAroundPlanet() {
        return densityOfBodiesAroundPlanet;
    }

    int getSize() {
        return size;
    }

    double getNumber_to_sun() {
        return number_to_sun;
    }

    String getRussian() {
        return russian;
    }
}

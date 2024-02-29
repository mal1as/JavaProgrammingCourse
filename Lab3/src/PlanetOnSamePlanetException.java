public class PlanetOnSamePlanetException extends RuntimeException {   //unchecked exception
    private Planet planet;

    PlanetOnSamePlanetException(Planet planet) {
        this.planet = planet;
    }

    @Override
    public String getMessage() {
        return "Нельзя положить в сумку планету, на которой находится эта сумка: " + planet.getRussian() + " находиться на самой себе!!!";
    }
}


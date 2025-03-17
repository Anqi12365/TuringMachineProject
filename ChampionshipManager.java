import java.util.*;

public class ChampionshipManager {
    private static ChampionshipManager instance;
    private List<Driver> drivers = new ArrayList<>();
    private List<RallyRaceResult> races = new ArrayList<>();

    private ChampionshipManager() {}

    public static ChampionshipManager getInstance() {
        if (instance == null) {
            instance = new ChampionshipManager();
        }
        return instance;
    }

    public void registerDriver(Driver driver) {
        drivers.add(driver);
    }

    public void addRace(RallyRaceResult race) {
        races.add(race);
    }

    public void displayStandings() {
        drivers.sort((d1, d2) -> Integer.compare(d2.getTotalPoints(), d1.getTotalPoints()));
        for (Driver driver : drivers) {
            System.out.println(driver.getName() + " (" + driver.getCountry() + "): " 
                + driver.getTotalPoints() + " points");
        }
    }
}

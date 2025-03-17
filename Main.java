public class Main {
    public static void main(String[] args) {
        ChampionshipManager manager = ChampionshipManager.getInstance();

        Driver d1 = new Driver("Sébastien Ogier", "France");
        Driver d2 = new Driver("Kalle Rovanperä", "Finland");

        manager.registerDriver(d1);
        manager.registerDriver(d2);

        RallyRaceResult race1 = new RallyRaceResult();
        race1.recordResult(d1, 1);
        race1.recordResult(d2, 2);

        manager.addRace(race1);

        System.out.println("==== CHAMPIONSHIP STANDINGS ====");
        manager.displayStandings();
    }
}

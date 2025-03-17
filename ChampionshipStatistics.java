import java.util.List;

public class ChampionshipStatistics {
    public static void printStatistics(List<Driver> drivers) {
        System.out.println("Total Drivers: " + drivers.size());
        int totalPoints = drivers.stream().mapToInt(Driver::getTotalPoints).sum();
        System.out.println("Total Points: " + totalPoints);
        System.out.println("Average Points per Driver: " + (totalPoints / (double) drivers.size()));
    }
}

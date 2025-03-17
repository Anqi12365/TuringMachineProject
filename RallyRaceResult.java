import java.util.*;

public class RallyRaceResult implements RaceResult {
    private Map<Driver, Integer> results = new HashMap<>();

    public void recordResult(Driver driver, int position) {
        int points = switch (position) {
            case 1 -> 25;
            case 2 -> 18;
            case 3 -> 15;
            case 4 -> 12;
            default -> 0;
        };
        driver.addPoints(points);
        results.put(driver, points);
    }

    public void displayResults() {
        results.forEach((driver, points) ->
            System.out.println(driver.getName() + " - " + points + " points"));
    }
}

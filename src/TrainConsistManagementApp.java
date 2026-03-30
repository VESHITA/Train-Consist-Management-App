import java.util.ArrayList;
import java.util.List;

// Bogie class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create list of Bogie objects
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        // Stream pipeline: map -> reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)       // extract capacity
                .reduce(0, Integer::sum);   // sum all values

        // Display total seating capacity
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        // Program continues
        System.out.println("\nSystem ready for further operations.");
    }
}
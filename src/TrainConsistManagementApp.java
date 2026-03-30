import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies (insertion order will be preserved)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate - will be ignored

        // Display final formation
        System.out.println("\nFinal Train Formation (Order Preserved, No Duplicates):");
        System.out.println(trainFormation);

        // Program continues
        System.out.println("\nSystem ready for further operations.");
    }
}
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Input from user
        System.out.print("\nEnter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainIdPattern = Pattern.compile(trainPattern);
        Pattern cargoCodePattern = Pattern.compile(cargoPattern);

        // Create matcher objects
        Matcher trainMatcher = trainIdPattern.matcher(trainId);
        Matcher cargoMatcher = cargoCodePattern.matcher(cargoCode);

        // Validate inputs
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Display results
        System.out.println("\nValidation Results:");

        if (isTrainValid) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID (Expected format: TRN-1234)");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID (Expected format: PET-AB)");
        }

        // Program continues
        System.out.println("\nSystem ready for further operations.");

        scanner.close();
    }
}
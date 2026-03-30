// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    String type;
    int capacity;

    // Constructor with validation
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " (Capacity: " + capacity + ")";
    }
}

// Main Application
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        try {
            // Valid bogie creation
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 60);

            System.out.println("\nValid Bogies Created:");
            System.out.println(b1);
            System.out.println(b2);

            // Invalid bogie (uncomment to test)
            PassengerBogie b3 = new PassengerBogie("First Class", -10);

        } catch (InvalidCapacityException e) {
            System.out.println("\nException Occurred: " + e.getMessage());
        }

        System.out.println("\nSystem continues safely...");
    }
}
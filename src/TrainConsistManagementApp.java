import java.util.ArrayList;
import java.util.List;

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " carrying " + cargo;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Box", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        // Try invalid case:
        // goodsBogies.add(new GoodsBogie("Cylindrical", "Water"));

        // Stream validation using allMatch()
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> {
                    // Rule: Cylindrical → only Petroleum allowed
                    if (b.type.equalsIgnoreCase("Cylindrical")) {
                        return b.cargo.equalsIgnoreCase("Petroleum");
                    }
                    return true; // other types are allowed
                });

        // Display result
        System.out.println("\nGoods Bogies:");
        goodsBogies.forEach(System.out::println);

        System.out.println("\nSafety Check Result:");
        if (isSafe) {
            System.out.println("Train is SAFE and compliant.");
        } else {
            System.out.println("Train is NOT SAFE! Invalid cargo detected.");
        }

        // Program continues
        System.out.println("\nSystem ready for further operations.");
    }
}
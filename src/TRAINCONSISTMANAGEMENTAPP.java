import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TRAINCONSISTMANAGEMENTAPP {
    public static void main(String[] args) {
        Set<String> bogieIDs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Train Consist Management System ===");
        System.out.print("Enter number of bogies to add: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Bogie ID " + i + ": ");
            String id = sc.nextLine();

            if (bogieIDs.add(id)) {
                System.out.println("Bogie ID added successfully.");
            } else {
                System.out.println("Duplicate ID! Ignored.");
            }
        }
        System.out.println("\n=== Unique Bogie IDs in Train ===");
        for (String id : bogieIDs) {
            System.out.println(id);
        }
        sc.close();
    }
}
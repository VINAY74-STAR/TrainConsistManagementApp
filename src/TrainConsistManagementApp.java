import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;
    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return type + " Bogie - Capacity: " + capacity;
    }
}
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 65));
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        System.out.println("Filtered Bogies:");
        filteredBogies.forEach(System.out::println);
    }
}
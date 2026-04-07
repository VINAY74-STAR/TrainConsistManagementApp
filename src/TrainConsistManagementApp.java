import java.util.*;
import java.util.stream.Collectors;
class Bogie {
    private String id;
    private String type;
    private int capacity;
    public Bogie(String id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }
    public String getType() { return type; }
    public String getId() { return id; }
    @Override
    public String toString() {
        return "Bogie{id='" + id + "', type='" + type + "'}";
    }
}
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        List<Bogie> trainConsist = Arrays.asList(
                new Bogie("B001", "Sleeper", 72),
                new Bogie("B002", "Goods", 0),
                new Bogie("B003", "AC Chair", 60),
                new Bogie("B004", "Sleeper", 72),
                new Bogie("B005", "Goods", 0),
                new Bogie("B006", "First Class", 24)
        );
        System.out.println("--- Original Train Consist ---");
        trainConsist.forEach(System.out::println);
        Map<String, List<Bogie>> groupedBogies = trainConsist.stream()
                .collect(Collectors.groupingBy(Bogie::getType));
        System.out.println("\n--- Bogies Grouped by Type ---");
        groupedBogies.forEach((type, bogies) -> {
            System.out.println(type + " Bogies: " + bogies);
        });
        System.out.println("\n--- Only Sleeper Bogies ---");
        System.out.println(groupedBogies.getOrDefault("Sleeper", new ArrayList<>()));
    }
}

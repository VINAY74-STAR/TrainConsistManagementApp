import java.util.*;
class Bogie {
    private String name;
    private int capacity;
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public String getName() { return name; }
    public int getCapacity() { return capacity; }
    @Override
    public String toString() {
        return String.format("%-15s | Capacity: %d", name, capacity);
    }
}
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        List<Bogie> passengerConsist = new ArrayList<>();
        passengerConsist.add(new Bogie("Sleeper", 72));
        passengerConsist.add(new Bogie("AC Chair", 56));
        passengerConsist.add(new Bogie("First Class", 24));
        passengerConsist.add(new Bogie("General", 90));

        System.out.println("--- Unsorted Consist ---");
        passengerConsist.forEach(System.out::println);
        passengerConsist.sort(Comparator.comparingInt(Bogie::getCapacity));
        System.out.println("\n--- Sorted Consist (By Capacity) ---");
        for (Bogie b : passengerConsist) {
            System.out.println(b);
        }
    }
}

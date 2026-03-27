import java.util.LinkedList;

public class TRAINCONSISTMANAGEMENTAPP {
    public static void main(String[] args) {

        LinkedList<String> consist = new LinkedList<>();

        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(consist);

        consist.add(2, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(consist);

        consist.removeFirst();
        consist.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(consist);
    }
}
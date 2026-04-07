import java.util.HashMap;
import java.util.Map;
public class TRAINCONSISTMANAGEMENTAPP {
    public static void main(String[] args) {
        Map<String,Integer> capacityMap = new HashMap<>();

        capacityMap.put("First Class",76);
        capacityMap.put("AC Chair",75);
        capacityMap.put("Sleeper",45);
        capacityMap.put("Cargo",35);
        for(Map.Entry<String,Integer> Map :capacityMap.entrySet()){
            System.out.println(Map.getKey()+"->"+Map.getValue());

        }
    }
}
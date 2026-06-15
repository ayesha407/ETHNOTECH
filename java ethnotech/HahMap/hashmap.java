import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {

        HashMap<String, String> livingbeing = new HashMap<>();

        livingbeing.put("Tree", "neem");
        livingbeing.put("Bird", "parrot");
        livingbeing.put("Animal", "Lion");
        System.out.println(livingbeing.get("Tree"));
        System.out.println(livingbeing.remove("Tree"));
        System.out.println(livingbeing.containsKey("Tree"));
        System.out.println(livingbeing.containsValue("Lion"));
        System.out.println(livingbeing.size());
        System.out.println(livingbeing.isEmpty());

        System.out.println(livingbeing);
    }
}
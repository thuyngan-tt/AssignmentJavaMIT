import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
public class lecture5 {
    static class SetExample {
        public static void main(String[] arguments) {
                HashMap<String, String> strings = new HashMap<String, String>();
                strings.put("Evan", "email1@mit.edu");
                strings.put("Eugene", "email2@mit.edu");
                strings.put("Evan", "email2@mit.edu");

               System.out.println(strings.size());

                strings.remove("Evan");

                System.out.println(strings.get("Eugene"));

                for (String s : strings.keySet()) {
                    System.out.println(s);

                }

                for (String s : strings.values()) {

                    System.out.println(s);

                }

                for (Map.Entry<String, String> pairs : strings.entrySet()) {

                    System.out.println(pairs);
                }
            }
    }
}

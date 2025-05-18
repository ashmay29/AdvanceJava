import java.util.LinkedHashMap;
import java.util.Map;

class UserActivity {
    public static void main(String[] args) {
        LinkedHashMap<String, String> activity = new LinkedHashMap<>();

        activity.put("Login", "10:00 AM");
        activity.put("Viewed Profile", "10:05 AM");
        activity.put("Uploaded Photo", "10:10 AM");

        for (Map.Entry<String, String> entry : activity.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

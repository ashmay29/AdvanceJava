
import java.util.List;

class StreamFilterMap {
    public static void main(String[] args) {
        List<String> names = List.of("Amit", "Rita", "Anil", "Suresh", "Alok");

        System.out.println("Names starting with A in uppercase:");
        names.stream()
             .filter(name -> name.startsWith("A"))
             .map(name -> name.toUpperCase())
             .forEach(name -> System.out.println(name));
    }
}

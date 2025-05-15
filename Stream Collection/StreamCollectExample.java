import java.util.List;
import java.util.stream.Collectors;

class StreamCollectExample {
    public static void main(String[] args) {
        List<String> names = List.of("john", "alice", "bob", "anita");

        List<String> upperNames = names.stream()
                                       .map(name -> name.toUpperCase())
				       .sorted()
                                       .collect(Collectors.toList());

        System.out.println("Original names: " + names);
        System.out.println("Uppercase names: " + upperNames);
    }
}

import java.util.List;

class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        System.out.println("All numbers:");
        numbers.stream()
               .forEach(n -> System.out.println(n));
    }
}

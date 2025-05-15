import java.util.List;

class StreamReduceSum {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 10, 15, 20, 25);

        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);

        System.out.println("List of numbers: " + numbers);
        System.out.println("Total sum using reduce: " + sum);
    }
}

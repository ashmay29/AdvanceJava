import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

class ParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 1_000_000)  // Increased dataset size
                                         .boxed()
                                         .collect(Collectors.toList());

        long startTime1 = System.currentTimeMillis();
        long sum1 = numbers.stream()
                           .mapToLong(n -> (long) n * n)
                           .sum();
        long endTime1 = System.currentTimeMillis();

        long startTime2 = System.currentTimeMillis();
        long sum2 = numbers.parallelStream()
                           .mapToLong(n -> (long) n * n) 
                           .sum();
        long endTime2 = System.currentTimeMillis();

        System.out.println("Sum of squares using normal stream: " + sum1);
        System.out.println("Time taken using normal stream: " + (endTime1 - startTime1) + " ms");

        System.out.println("Sum of squares using parallel stream: " + sum2);
        System.out.println("Time taken using parallel stream: " + (endTime2 - startTime2) + " ms");
    }
}

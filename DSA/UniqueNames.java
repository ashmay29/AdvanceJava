import java.util.HashSet;
import java.util.Scanner;

class UniqueNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> names = new HashSet<>();

        names.add("Amit");
        names.add("Rita");
        names.add("Amit");
        names.add("Sita");

        for (String name : names) {
            System.out.println(name);
        }
    }
}

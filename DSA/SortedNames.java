import java.util.TreeSet;

class SortedNames {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();

        names.add("Zara");
        names.add("Aman");
        names.add("Karan");
        names.add("Maya");

        for (String name : names) {
            System.out.println(name);
        }
    }
}

import java.util.HashMap;

class StudentGrades {
    public static void main(String[] args) {
        HashMap<Integer, String> grades = new HashMap<>();

        grades.put(101, "A");
        grades.put(102, "B+");
        grades.put(103, "A-");

        System.out.println("Roll 101: " + grades.get(101));
        System.out.println("Roll 102: " + grades.get(102));
        System.out.println("Roll 103: " + grades.get(103));
    }
}

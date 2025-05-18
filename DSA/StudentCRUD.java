import java.util.ArrayList;

class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String toString() {
        return name + " (Roll: " + roll + ")";
    }
}

class StudentCRUD {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Anya", 1));
        students.add(new Student("Rahul", 2));
        students.add(new Student("Meena", 3));

        for (Student s : students) {
            System.out.println(s);
        }

        students.get(1).name = "Ravi";

        students.remove(0);

        System.out.println("After Update and Delete:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

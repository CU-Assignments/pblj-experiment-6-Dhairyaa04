import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " - Marks: " + marks;
    }
}

public class StudentFilter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 82.5),
            new Student("Bob", 74.0),
            new Student("Charlie", 90.0),
            new Student("David", 67.5),
            new Student("Eva", 78.0)
        );

        students.stream()
                .filter(s -> s.marks > 75)
                .sorted(Comparator.comparingDouble(s -> s.marks))
                .map(s -> s.name)
                .forEach(System.out::println);
    }
}

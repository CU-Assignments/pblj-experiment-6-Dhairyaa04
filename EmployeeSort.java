import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return name + " - Age: " + age + ", Salary: " + salary;
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 50000));
        employees.add(new Employee("Bob", 25, 60000));
        employees.add(new Employee("Charlie", 35, 55000));

        employees.sort((e1, e2) -> e1.name.compareTo(e2.name));
        System.out.println("Sorted by Name: " + employees);

        employees.sort((e1, e2) -> Integer.compare(e1.age, e2.age));
        System.out.println("Sorted by Age: " + employees);

        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
        System.out.println("Sorted by Salary: " + employees);
    }
}

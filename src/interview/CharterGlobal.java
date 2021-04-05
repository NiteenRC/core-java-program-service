package interview;

import java.util.*;
import java.util.stream.Collectors;

public class CharterGlobal {
    public static void main(String[] args) {
        sorting();

        equalsHashCode();
    }

    public static void equalsHashCode() {
        Map<Employee, String> employeeStringMap = new HashMap<>();
        final Employee key = new Employee(1L, "Tushar", "B");
        employeeStringMap.put(key, "first");
        employeeStringMap.put(new Employee(1L, "Tushar", "B"), "first");
        System.out.println(employeeStringMap.size());
        System.out.println(employeeStringMap.get(key));
    }

    private static void sorting() {
        Employee employee1 = new Employee(1L, "B", "C");
        Employee employee2 = new Employee(2L, "A", "B");
        Employee employee3 = new Employee(3L, "Z", "A");
        Employee employee4 = new Employee(4L, "A", "C");

        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4);
        Comparator<Employee> comparator = Comparator.comparing(Employee::getFirstName)
                .thenComparing(Employee::getLastName);

        employees.stream().sorted(comparator).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

class Employee {
    private Long id;
    private String firstName;
    private String lastName;

    public Employee(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return new Random().nextInt();
    }
}




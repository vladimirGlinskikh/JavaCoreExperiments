package core.comparableAndComparator.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App_1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee(5, "Vladimir", "Vladimirov", 123_000);
        Employee employee2 = new Employee(4, "Vladimir", "Vladikov", 134_000);
        Employee employee3 = new Employee(9, "Sergey", "Sergeev", 120_000);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println("Before sorting\n " + list);
        Collections.sort(list);
//        Collections.sort(list, new SalaryComparator());
        Collections.sort(list, new NameComparator());
        System.out.println("After sorting\n " + list);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        if (this.id == anotherEmployee.id) {
            return 0;
        } else if (this.id < anotherEmployee.id) {
            return -1;
        } else
            return 1;
//
////        return this.name.compareTo(anotherEmployee.name);
//
//        int result = this.name.compareTo(anotherEmployee.name);
//        if (result == 0) {
//            result = this.surname.compareTo(anotherEmployee.surname);
//        }
//        return result;
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.salary == emp2.salary) {
            return 0;
        } else if (emp1.salary < emp2.salary) {
            return -1;
        } else
            return 1;
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int result = emp1.name.compareTo(emp2.name);
        if (result == 0) {
            result = emp1.surname.compareTo(emp2.surname);
        }
        return result;
    }
}

package javaExperiments.comparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparation2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee one = new Employee(19, "Vladimir", "Glinskikh", 1_000);
        Employee two = new Employee(3, "Svetlana", "Ivanova", 2_000);
        Employee three = new Employee(8, "Aleksandr", "Kotov", 4_000);
        Employee four = new Employee(4, "Aleksandr", "Solntsev", 9_000);
        Employee five = new Employee(9, "Aleksandr", "Kot", 3_000);
//        Arrays.sort(new Employee[] {one, two, three});
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        System.out.println("Before sorted:\n" + list);
        System.out.println("------------------------------");
        Collections.sort(list);
        System.out.println("After sorted:\n" + list);
    }
}

class Employee implements Comparable<Employee> {
    //    Integer id;
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
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}' + "\n";
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
//        if (this.id == anotherEmployee.id) {
//            return 0;
//        } else if (this.id < anotherEmployee.id) {
//            return -1;
//        } else {
//            return 0;
//        }

//        return this.id - anotherEmployee.id;

//        return this.id.compareTo(anotherEmployee.id);

        int result = this.name.compareTo(anotherEmployee.name);
        if (result == 0) {
            result = this.surname.compareTo(anotherEmployee.surname);
        }
        return result;
    }
}

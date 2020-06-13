package designPatterns.creational.prototype;

import java.util.List;

public class PtototypePatternTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        Employees empNew = (Employees) employees.clone();
        Employees empNew1 = (Employees) employees.clone();
        List<String> list = empNew.getEmpList();
        list.add("Angelina");
        List<String> list1 = empNew1.getEmpList();
        list1.remove("Vladimir");

        System.out.println("emps List: " + employees.getEmpList());
        System.out.println("empNew List: " + list);
        System.out.println("empNew1 List: " + list1);
        System.out.println("empNew List: " + list);
    }
}

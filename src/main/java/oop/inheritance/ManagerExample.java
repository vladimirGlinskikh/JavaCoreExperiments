package oop.inheritance;

public class ManagerExample {
    public static void main(String[] args) {
        Manager boss = new Manager("Many Paky", 60_000, 1984, 12, 15);
        boss.setBonus(3000);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Lyba Kim", 40_000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tomyy", 30_000, 1990, 3, 12);

        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
        }
    }
}

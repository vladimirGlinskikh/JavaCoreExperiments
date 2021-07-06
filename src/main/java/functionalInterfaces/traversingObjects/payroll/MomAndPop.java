package functionalInterfaces.traversingObjects.payroll;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MomAndPop implements Iterable<Employee> {
    static int NUM_EXECS = 2;
    static double profit;
    Employee CEO;
    Employee vicePresident;
    List<Employee> districtManagers;
    List<Employee> programmers;

    public MomAndPop() {
        CEO = new Employee("Mr. Bucks", 1_000_000.0, 75_000.0, 0.15);
        vicePresident = new Employee("Highly Mobile", 750_000.0, 25_000.0, 0.15);
        districtManagers = Arrays.asList(
                new Employee("Vladimir Glinskikh", 150_000.0, 10_000.0, 0.15),
                new Employee("Andrey Shatalov", 210_000.0, 9_000.0, 0.15));
        programmers = Arrays.asList(
                new Employee("Andrey Grishenko", 150_000.0, 2_000.0, 0.10),
                new Employee("Nikolay Romanov", 155_000.0, 1500.0, 0.10),
                new Employee("Vasiliy Tkachuk", 140_000.0, 1200.0, 0.10),
                new Employee("Andrey Koshinky", 130_000.0, 1300.0, 0.10));
    }

    public Iterator<Employee> iterator() {
        return new EmployeeIterator();
    }

    private class EmployeeIterator implements Iterator<Employee> {
        private final int limit;
        private int cursor;

        public EmployeeIterator() {
            cursor = 0;
            limit = NUM_EXECS + districtManagers.size()
                    + programmers.size();
        }

        @Override
        public boolean hasNext() {
            return cursor < limit;
        }

        @Override
        public Employee next() {
            Employee emp = null;
            if (hasNext()) {
                if (cursor == 0)
                    emp = CEO;
                else if (cursor == 1)
                    emp = vicePresident;
                else if (cursor < (NUM_EXECS + districtManagers.size()))
                    emp = districtManagers.get(cursor - NUM_EXECS);
                else if (cursor < (NUM_EXECS + districtManagers.size()
                        + programmers.size()))
                    emp = programmers.get(cursor - NUM_EXECS - districtManagers.size());
                cursor++;
            }
            return emp;
        }
    }
}
package functionalInterfaces.traversingObjects.traversingMaps;

import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        TreeMap<String, Double> employeeSalaries = new TreeMap<>();
        employeeSalaries.put("Vladimir Glinskikh", 100_000.0);
        employeeSalaries.put("Andrey Grishenko", 95_000.0);
        employeeSalaries.put("Andrey Shatalov", 110_000.0);

        employeeSalaries.forEach((x, y) ->
                System.out.println(x + " makes $" + y + " annually."));
    }
}

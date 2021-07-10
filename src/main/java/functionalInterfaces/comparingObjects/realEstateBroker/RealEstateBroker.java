package functionalInterfaces.comparingObjects.realEstateBroker;

import java.util.*;
import java.util.function.Supplier;

public class RealEstateBroker {
    public static void main(String[] args) {
        System.out.println("Home Listings for Forest Acres, "
                + " Happy Gardens, and Comfy Condos\n");
        List<Home> homes = Arrays.asList(
                new Home("Forest Acres", 425_000.0, 4, 1.7, 5.1, 4.5),
                new Home("Happy Gardens", 510_000.0, 4, 2.3, 5.1, 4.5),
                new Home("Comfy Condos", 190_000.0, 2, 0.9, 2.1, 4.5),
                new Home("Comfy Condos", 190_000.0, 2, 0.9, 0.7, 4.5),
                new Home("Happy Gardens", 470_000.0, 4, 2.1, 5.1, 4.5),
                new Home("Forest Acres", 345_000.0, 3, 1.5, 3.2, 5.9),
                new Home("Happy Gardens", 375_000.0, 3, 1.5, 2.3, 2.4),
                new Home("Comfy Condos", 190_000.0, 2, 0.3, 0.5, 2.4)
        );

        Comparator<Home> byPrice = Comparator.comparing(x -> x.price);
        Comparator<Home> byBedRooms = Comparator.comparing(x -> x.numBedrooms);
        Comparator<Home> byBedRoomsRev = byBedRooms.reversed();
        Comparator<Home> byProperty = Comparator.comparing(x -> x.acres, (x, y) -> (int) (Math.ceil(y) - Math.ceil(x)));
        Comparator<Home> bySchool = Comparator.comparing(x -> x.schoolDistance, (x, y) -> (int) (Math.ceil(y) - Math.ceil(x)));
        Comparator<Home> byTrain = Comparator.comparing(x -> x.trainDistance, (x, y) -> (int) (Math.ceil(y) - Math.ceil(x)));
        Supplier<Integer> priorityNumber = () -> {
            Scanner input = new Scanner(System.in);
            int priority = -1;
            while (priority < 0 || priority > 4) {
                System.out.println("Select a Priority:");
                System.out.println("0 - price");
                System.out.println("1 - number of bedrooms");
                System.out.println("2 - priority size");
                System.out.println("3 - distance to nearest school");
                System.out.print("4 - distance to train station:");
                priority = Integer.parseInt(input.nextLine());
                if (priority < 0 || priority > 4)
                    System.out.println("Invalid priority");
            }
            return priority;
        };

        Supplier<String> comm = () -> {
            Scanner input = new Scanner(System.in);
            String[] communities = {"Forest Acres", "Happy Gardens", "Comfy Condos", "any"};
            int selection = -1;
            while (selection < 0 || selection > 3) {
                System.out.println("Select community:");
                System.out.println("0 - Forest Acres");
                System.out.println("1 - Happy Gardens");
                System.out.println("2 - Comfy Condos");
                System.out.println("3 - any:");
                selection = Integer.parseInt(input.nextLine());
                if ((selection < 0 || selection > 3))
                    System.out.println("Invalid community");
            }
            return communities[selection];
        };

        Supplier<Comparator<Home>> priority = () -> {
            Comparator<Home> pr;
            int prNumber = priorityNumber.get();
            switch (prNumber) {
                case 0:
                    pr = byPrice;
                    break;
                case 1:
                    pr = byBedRoomsRev;
                    break;
                case 2:
                    pr = byProperty;
                    break;
                case 3:
                    pr = bySchool;
                    break;
                default:
                    pr = byTrain;
            }
            return pr;
        };

        Comparator<Home> priority1, priority2, priority3;
        String community = comm.get();

        List<Home> homesTemp = new ArrayList<>(homes);
        if (!community.equals("any"))
            homesTemp.removeIf(x -> !x.community.equals(community));
        priority1 = priority.get();
        priority2 = priority.get();
        priority3 = priority.get();
        homesTemp.sort(priority1.thenComparing(priority2).thenComparing(priority3));
        homesTemp.forEach(System.out::println);
    }
}

package functionalInterfaces.functions.salesPromotions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class SalesPromotion {
    final static Customer[] customers = {
            new Customer("Vladimir Glinskikh", "7056783421", "football",
                    "Giants", 3.61, null, 0, null),
            new Customer("Andrey Grishenko", "7073456789", "tennis",
                    null, 3.92, "Java", 0, null),
            new Customer("Andrey Shatalov", "7072341232", "football",
                    "Eagles", 3.71, null, 1,
                    "Olya Korotkova, 2134567445"),
            new Customer("Vasiliy Cherny", "7056784324", "golf",
                    null, 3.85, "Physics", 1,
                    "Tatiana Reginat, 7642349011")
    };

    private static void matchCustomers(Customer customer, List<BiFunction<Customer, Integer, ? extends Record>> functions) {
        for (BiFunction<Customer, Integer, ? extends Record> function : functions) {
            Record record;
            int index = 0;
            do {
                record = function.apply(customer, index);
                if (record != null) {
                    System.out.println(record);
                    index = record.index + 1;
                }
            } while (record != null);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BiFunction<Customer, Integer, SportRecord> fsport = (x, z) -> {
            SportRecord sport = null;
            for (int i = z; i < customers.length && sport == null; ++i)
                if (customers[i].sport.equals(x.sport))
                    sport = new SportRecord(customers[i].name,
                            customers[i].phoneNum,
                            i,
                            customers[i].team);
            return sport;
        };

        BiFunction<Customer, Integer, GpaRecord> fgpa = (x, z) -> {
            GpaRecord gpa = null;
            for (int i = z; i < customers.length && gpa == null; ++i)
                if (customers[i].gpa >= x.gpa)
                    gpa = new GpaRecord(customers[i].name,
                            customers[i].phoneNum,
                            i,
                            customers[i].subject);
            return gpa;
        };

        BiFunction<Customer, Integer, FriendsRecord> ffriends = (x, z) -> {
            FriendsRecord friends = null;
            for (int i = z; i < customers.length && friends == null; ++i)
                if (customers[i].numFriends >= x.numFriends)
                    friends = new FriendsRecord(customers[i].name,
                            customers[i].phoneNum,
                            i,
                            customers[i].friends);
            return friends;
        };

        List<BiFunction<Customer, Integer, ? extends Record>> list = new ArrayList<>();
        list.add(fsport);
        list.add(fgpa);
        list.add(ffriends);

        System.out.println("SUNDAY FOOTBALL PROMOTION - Call the following customers: ");
        matchCustomers(new Customer(null, null, "football", null,
                Double.MAX_VALUE, null, Integer.MAX_VALUE, null), list);

        System.out.println("TUESDAY HIGH-TECH PROMOTION - Call the following customers:");
        matchCustomers(new Customer(null, null, null, null, 3.75,
                null, Integer.MAX_VALUE, null), list);

        System.out.println("FRIDAY BRING A FRIEND PROMOTION - Call the following customers:");
        matchCustomers(new Customer(null, null, null, null,
                Double.MAX_VALUE, null, 1, null), list);
    }
}

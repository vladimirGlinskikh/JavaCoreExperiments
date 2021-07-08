package functionalInterfaces.collections.departmentOfMotorVehicles;

import java.time.LocalDate;
import java.time.Month;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class DMV {
    public static void main(String[] args) {
        Map<String, Licence> driver = new TreeMap<>();
        System.out.println("Welcome to the Department of Motor Vehicles.");

        Supplier<Integer> selectOperation = () -> {
            int selection = -1;
            Scanner input = new Scanner(System.in);
            while (selection < 0 || selection > 7) {
                System.out.println("Select and Operation:");
                System.out.println(" 0 - Add Driver 1 - Remove Driver 2 - Change Insurance");
                System.out.println(" 3 - Suspend Lic 4 - Renew licence 5 - Add vehicles");
                System.out.print(" 6 - Remove vehicles 7 - Quit:");
                selection = Integer.parseInt(input.nextLine());
                if (selection < 0 || selection > 7)
                    System.out.println("Invalid selection");
            }
            return selection;
        };

        Supplier<String> licenseId = () -> {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter licenseId:");
            return input.nextLine();
        };

        Supplier<String> insurance = () -> {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter insurance:");
            return input.nextLine();
        };

        Supplier<LocalDate> expDate = () -> {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter year:");
            int year = Integer.parseInt(input.nextLine());
            System.out.print("Enter month:");
            Month month = Month.valueOf(input.nextLine());
            System.out.print("Enter day:");
            int day = Integer.parseInt(input.nextLine());
            return LocalDate.of(year, month, day);
        };

        Supplier<Vehicle> vehicle = () -> {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter make:");
            String make = input.nextLine();
            System.out.print("Enter model:");
            String model = input.nextLine();
            System.out.print("Enter year:");
            int year = Integer.parseInt(input.nextLine());
            return new Vehicle(make, model, year);
        };

        int operation = 0;
        while (operation != 7) {
            operation = selectOperation.get();
            switch (operation) {
                case 0:
                    BiFunction<Licence, Licence, Licence> addDriver = (ov, nv) -> ov;
                    System.out.println(driver.merge(licenseId.get(),
                            new Licence(expDate.get(),
                                    null), addDriver));
                    break;
                case 1:
                    BiFunction<String, Licence, Licence> remove = (k, v) -> null;
                    System.out.println(driver.computeIfPresent(licenseId.get(), remove));
                    break;
                case 2:
                    BiFunction<Licence, Licence, Licence> changeInsurance = (ov, nv) -> new Licence(
                            ov.expDate,
                            nv.insurance,
                            ov.status,
                            ov.vehicles);
                    System.out.println(driver.merge(licenseId.get(),
                            new Licence(null, insurance.get()),
                            changeInsurance));
                    break;
                case 3:
                    BiFunction<String, Licence, Licence> suspend = (k, v) -> new Licence(
                            v.expDate,
                            v.insurance,
                            STATUS.SUSPENDED,
                            v.vehicles);
                    System.out.println(driver.computeIfPresent(licenseId.get(), suspend));
                    break;
                case 4:
                    BiFunction<Licence, Licence, Licence> renew = (ov, nv) -> new Licence(
                            nv.expDate,
                            ov.insurance,
                            STATUS.ACTIVE,
                            ov.vehicles);
                    System.out.println(driver.merge(licenseId.get(),
                            new Licence(expDate.get(), null),
                            renew));
                    break;
                case 5:
                    BiFunction<Licence, Licence, Licence> addVehicle = (ov, nv) -> {
                        Licence temp = new Licence(ov);
                        temp.vehicles.add(nv.vehicles.get(0));
                        return temp;
                    };
                    System.out.println(driver.merge(licenseId.get(),
                            new Licence(null, null, vehicle.get()),
                            addVehicle));
                    break;
                case 6:
                    BiFunction<Licence, Licence, Licence> removeVehicle = (ov, nv) -> {
                        Licence temp = new Licence(ov);
                        Vehicle r = nv.vehicles.get(0);
                        temp.vehicles.removeIf(
                                x -> x.make.equals(r.make)
                                        && x.model.equals(r.model)
                                        && x.year == r.year);
                        return temp;
                    };
                    System.out.println(driver.merge(licenseId.get(),
                            new Licence(null, null, vehicle.get()),
                            removeVehicle));
            }
        }
    }
}

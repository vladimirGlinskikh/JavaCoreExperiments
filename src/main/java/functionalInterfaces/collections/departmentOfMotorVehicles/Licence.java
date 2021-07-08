package functionalInterfaces.collections.departmentOfMotorVehicles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Licence {
    LocalDate expDate;
    String insurance;
    STATUS status;
    List<Vehicle> vehicles;

    public Licence(LocalDate expDate, String insurance, Vehicle... v) {
        this.expDate = expDate;
        this.insurance = insurance;
        status = STATUS.ACTIVE;
        vehicles = new ArrayList<>();
        for (Vehicle r : v)
            vehicles.add(r);
    }

    public Licence(LocalDate expDate, String insurance, STATUS status, List<Vehicle> vs) {
        this.expDate = expDate;
        this.insurance = insurance;
        this.status = status;
        vehicles = new ArrayList<>(vs);
    }

    public Licence(Licence l) {
        expDate = l.expDate;
        insurance = l.insurance;
        status = l.status;
        vehicles = new ArrayList<>(l.vehicles);
    }

    @Override
    public String toString() {
        return expDate + " " + insurance + " " + status + " " + vehicles;
    }
}

package solid.openClosedPrincipal;

public class HealthInsuranceSurveyor extends InsuranceSurveyor {
    public boolean isValidClaim() {
        System.out.println("HealthInsuranceSurveyor: Validating heath insurance claim...");
        return true;
    }
}

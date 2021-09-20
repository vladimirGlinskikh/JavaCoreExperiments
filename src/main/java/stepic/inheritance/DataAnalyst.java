package stepic.inheritance;

public class DataAnalyst extends Employee {
    private boolean phd;
    private String[] methods;

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
        getName();
        getEmail();
        getExperience();
    }

    public boolean isPhD() {
        return phd;
    }

    public String[] getMethods() {
        return methods;
    }
}

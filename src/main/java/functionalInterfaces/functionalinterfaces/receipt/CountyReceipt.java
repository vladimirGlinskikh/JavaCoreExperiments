package functionalInterfaces.functionalinterfaces.receipt;

public class CountyReceipt extends Receipt {
    double countyTax;

    public CountyReceipt(Receipt receipt, double countyTax) {
        super(receipt);
        this.countyTax = countyTax;
    }
}

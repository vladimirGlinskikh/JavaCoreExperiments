package functionalInterfaces.receipt;

public class Receipt {
    String item;
    double price;
    double discount;
    double tax;

    public Receipt(String item, double price, double discount, double tax) {
        this.item = item;
        this.price = price;
        this.discount = discount;
        this.tax = tax;
    }
}

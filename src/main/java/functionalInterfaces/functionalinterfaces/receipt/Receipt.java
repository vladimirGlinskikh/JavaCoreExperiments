package functionalInterfaces.functionalinterfaces.receipt;

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


    public Receipt(Receipt receipt) {
        item = receipt.item;
        price = receipt.price;
        discount = receipt.discount;
        tax = receipt.tax;
    }
}

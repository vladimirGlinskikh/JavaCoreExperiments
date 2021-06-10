package functionalInterfaces.receipt;

public class App {
    public static void main(String[] args) {
        ReceiptPrinter<Receipt> simpleReceiptPrinter = new ReceiptPrinter<>() {
            @Override
            public void print(Receipt receipt) {
                System.out.println("\nItem :\t" + receipt.item);
                System.out.println("Price:\t" + receipt.price);
                System.out.println("Disc:\t" + receipt.discount);
                System.out.println("Tax:\t" + receipt.tax);
                System.out.println("Total:\t" + computeTotal(receipt));
            }
        };

        ReceiptPrinter<CountyReceipt> countyReceiptPrinter = new ReceiptPrinter<>() {
            @Override
            public void print(CountyReceipt receipt) {
                System.out.println("\nItem :\t" + receipt.item);
                System.out.println("Price:\t" + receipt.price);
                System.out.println("Disc:\t" + receipt.discount);
                System.out.println("Total:\t" + computeTotal(receipt));
            }

            @Override
            public double computeTotal(CountyReceipt receipt) {
                double discountedPrice = receipt.price - (receipt.price * receipt.discount);
                return discountedPrice
                        + (discountedPrice * receipt.tax)
                        + (discountedPrice * receipt.countyTax);
            }
        };

        Receipt receipt = new Receipt("shirt", 20.00, 0.09, 0.03);
        simpleReceiptPrinter.print(receipt);

        CountyReceipt countyReceipt = new CountyReceipt(receipt, 0.04);
        countyReceiptPrinter.print(countyReceipt);
    }
}

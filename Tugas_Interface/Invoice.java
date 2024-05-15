package Tugas_Interface;
public class Invoice implements Payable {
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    @Override
    public String toString() {
        return String.format("%-15s %3d x Rp %,1d.00 = Rp %,1d.00", productName, quantity, pricePerItem, (int) getPayableAmount());
    }
}


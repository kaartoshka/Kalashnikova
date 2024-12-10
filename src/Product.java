public class Product {
    private String name;
    private int quantity;
    private Supplier supplier;

    public Product(String name, int quantity, Supplier supplier) {
        this.name = name;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void addQuantity(int amount) {
        this.quantity += amount;
    }

    public boolean removeQuantity(int amount) {
        if (amount <= quantity) {
            this.quantity -= amount;
            return true;
        }
        return false;
    }
}

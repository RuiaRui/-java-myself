//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String var1, int var2, double var3) {
        this.name = var1;
        this.quantity = var2;
        this.price = var3;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        return this.getName() + "_" + this.getQuantity() + "_" + this.getPrice();
    }

    public double getValue() {
        return (double)this.getQuantity() * this.getPrice();
    }
}

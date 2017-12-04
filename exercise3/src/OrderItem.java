public class OrderItem {
    private int quantity;
    private Product product;

    public OrderItem(Product initialProduct, int initialQuantity){
        quantity=initialQuantity;
        product=initialProduct;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getValue(){
        return quantity*product.getPrice();
    }

    @Override
    public String toString() {
        return getQuantity()+" "+product.getCode()+" "+product.getPrice();
    }
}

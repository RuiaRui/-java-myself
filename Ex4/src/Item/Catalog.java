package Item;

import java.util.ArrayList;
import java.util.Iterator;

public class Catalog {

    private ArrayList<Product> products;


    public Catalog() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public Product getProduct(String code) {
        for (Product product : this.products) {
            if (code==product.getCode() ) {
                return product;
            }
        }
        return null;
    }

    public Iterator<Product> iterator() {
        return this.products.iterator();
    }

    public int getNumberOfProducts() {
        return this.products.size();
    }

    public ArrayList<Product> getProducts(){
        return products;
    }
}

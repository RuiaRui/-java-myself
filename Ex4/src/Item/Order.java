package Item;

import java.util.ArrayList;
import java.util.Iterator;


public class Order {
    private ArrayList<OrderItem> items;

    public Order() {
        items = new ArrayList<>();
    }


    public void addItem(OrderItem orderItem) {
        this.items.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        this.items.remove(orderItem);
    }

    public OrderItem getItem(Product product) {
        for (OrderItem oi : items) {
            if (oi.getProduct() == product) {
                return oi;
            }
        }
        return null;
    }

    public Iterator<OrderItem> iterator() {
        return this.items.iterator();
    }

    public int getNumberOfItems() {
        return this.items.size();
    }

    public double getTotalCost() {
        double tolCost = 0.0;
        for (OrderItem oi : items) {
            tolCost += oi.getValue();
        }
        return tolCost;
    }

    public ArrayList<OrderItem> getItems(){
        return items;
    }

}

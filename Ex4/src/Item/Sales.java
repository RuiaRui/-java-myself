package Item;

import java.util.ArrayList;
import java.util.Iterator;

public class Sales {
    private ArrayList<Order> orders;

    public  Sales(){
        this.orders=new ArrayList<>();
    }
    public void addOrder(Order order) {
        this.orders.add(order);
    }
    public Iterator<Order> iterator() {
        return this.orders.iterator();
    }

    public int getNumberOfOrders() {
        return this.orders.size();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {
    private ArrayList<Product> cart = new ArrayList();

    public ShoppingCart() {
    }

    public void addProduct(Product var1) {
        this.cart.add(var1);
    }

    public String toString() {
        if (this.cart.size() == 0) {
            return "empty";
        } else {
            Iterator var1 = this.cart.iterator();
            StringBuffer var2 = new StringBuffer(((Product)var1.next()).toString());

            while(var1.hasNext()) {
                var2.append("\n");
                var2.append(((Product)var1.next()).toString());
            }

            return var2.toString();
        }
    }

    public double getTotalValue() {
        double var1 = 0.0D;

        Product var4;
        for(Iterator var3 = this.cart.iterator(); var3.hasNext(); var1 += var4.getValue()) {
            var4 = (Product)var3.next();
        }

        return var1;
    }
}

import com.sun.xml.internal.ws.server.ServerRtException;

public class Product {

    private String code;
    private String description;
    private double price;

    public Product(String initialCode, String initialDescription, double initialPrice) {
        code = initialCode;
        description = initialDescription;
        price = initialPrice;


    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;

    }

    public double getPrice() {
        return price;

    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Product && getCode().equals(code)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format(code+"_"+description+"_"+price);
    }
}

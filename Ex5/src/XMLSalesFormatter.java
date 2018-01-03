


public class XMLSalesFormatter implements SalesFormatter {
    public static XMLSalesFormatter singletonInstance;

    private XMLSalesFormatter(){

    }

    public static XMLSalesFormatter getSingletonInstance(){
        if (singletonInstance == null) {
            singletonInstance = new XMLSalesFormatter();
        }
        return singletonInstance;
    }

    @Override
    public String formatSales(Sales sales) {
        String xml="";
        xml+="<Sales>\n" ;
        for (Order order:sales) {
            xml+="<Order total=\""+order.getTotalCost()+"\">\n";
            for (OrderItem orderitem:order) {
                xml+="<OrderItem quantity=\""+orderitem.getQuantity()
                        + "\" price=\""+orderitem.getProduct().getPrice()+"\">"
                        + orderitem.getProduct().getCode()+"</OrderItem>\n";
            }
            xml+="</Order>\n";
        }
        xml+="</Sales>\n";
        return xml;
    }
}

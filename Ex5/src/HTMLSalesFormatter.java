

public class HTMLSalesFormatter implements SalesFormatter {
    public static HTMLSalesFormatter singletonInstance;

    private HTMLSalesFormatter(){

    }

    public static HTMLSalesFormatter getSingletonInstance(){
        if (singletonInstance == null) {
            singletonInstance = new HTMLSalesFormatter();
        }
        return singletonInstance;
    }

    @Override
    public String formatSales(Sales sales) {
       String html="";

       html +="<html>\n" +
               "<body>\n" +
               "<center><h2>Orders</h2></center>";
        for (Order order:sales) {
            html+="<hr>\n" +
                    "<h4>Total = "+order.getTotalCost()+"</h4>\n" ;

            for (OrderItem orderitem:order) {
                html+= "<p>\n" +
                        "<b>code:</b> "+orderitem.getProduct().getCode()+"<br>\n"
                        + "<b>quantity:</b>"+orderitem.getQuantity()+"<br>\n"
                        + "<b>price:</b>"+orderitem.getProduct().getPrice()+"\n"
                        + "</p>\n" ;
            }

        }
        html+="</body> \n</html>";
        return html;

    }
}

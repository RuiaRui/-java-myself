
public class PlainTextSalesFormatter implements SalesFormatter {
   public static PlainTextSalesFormatter singletonInstance;

    private PlainTextSalesFormatter(){

    }

    public static PlainTextSalesFormatter getSingletonInstance(){
        if (singletonInstance == null) {
            singletonInstance = new PlainTextSalesFormatter();
        }
        return singletonInstance;
    }

    @Override
    public String formatSales(Sales sales) {
        String display="";
        int i=1;
        for (Order order:sales) {
            display += "------------------------\n";
            display+="Order "+ i++ +"\n";
            for (OrderItem orderitem:order) {
                display+=orderitem.getQuantity()+" "+orderitem.getProduct().getCode()+" "
                        +orderitem.getProduct().getPrice();
            }
            display+= "Total = "+order.getTotalCost()+"\n";
        }
        return display;

    }
}

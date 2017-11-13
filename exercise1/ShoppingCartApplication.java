import jdk.nashorn.internal.ir.Symbol;

import  java.io.*;
import  java.util.*;


/* DOCUMENT THIS CLASS */
public class ShoppingCartApplication  {

    private static BufferedReader  stdIn =
            new  BufferedReader(new  InputStreamReader(System.in));
    private static PrintWriter  stdOut =
            new  PrintWriter(System.out, true);
    private static PrintWriter  stdErr =
            new  PrintWriter(System.err, true);

    private ShoppingCart cart;

    /* DOCUMENT THIS PUBLIC METHOD */
    public static void main(String[]  args) throws IOException  {

        ShoppingCartApplication application = new  ShoppingCartApplication();

        application.run();
    }

    private void run() throws IOException  {

        cart = new  ShoppingCart();

        int  choice = getChoice();

        while (choice != 0)  {

            if (choice == 1)  {
                cart.addProduct(readProduct());
            } else if (choice == 2)  {
                stdOut.println(cart.toString());
            } else if (choice == 3)  {
                stdOut.println(cart.getTotalValue());
            }

            choice = getChoice();
        }
    }

    private int  getChoice() throws IOException  {

        do  {

            int input;

            try  {
                stdErr.println();
                stdErr.print("[0]  Quit\n"
                        + "[1]  Add Product\n"
                        + "[2]  Display Products\n"
                        + "[3]  Display Total\n"
                        + "choice>");
                stdErr.flush();

                input = Integer.parseInt(stdIn.readLine());

                if (0 <= input && 3 >= input)  {

                    return  input;

                } else {
                    stdOut.println("Invalid choice:  " + input);
                }
            } catch (NumberFormatException  nfe)  {
                stdErr.println(nfe);
            }
        }  while (true);
    }

    private Product readProduct() throws IOException {

        final String underline = "_";

        String name = "";
        int quantity = 0;
        double price = 0.0;

		/* PLACE YOUR CODE HERE */
		do{

            try{
                System.out.print("product [name_qty_price]>");
                System.out.flush();

                StringTokenizer tokenizer = new StringTokenizer(stdIn.readLine(),underline);

                if (tokenizer.countTokens()!=3){
                    System.out.println("Invalid input");
                }else {
                    name = tokenizer.nextToken();
                    quantity = Integer.valueOf(tokenizer.nextToken());
                    price = Double.valueOf(tokenizer.nextToken());

                    if(quantity>0&&price>0.0){
                        return new Product(name, quantity, price);
                    }else{
                        System.out.println("Invalid input");
                    }
                }

            }catch (NumberFormatException  nfe)  {
                stdErr.println(nfe);
            }

        } while (true);





       // return new Product(name, quantity, price);
    }
}

package oop;
import java.util.Map;
import java.util.ArrayList;

public class Bill {
    public static void bills() {
        Map<Integer, Integer> stock = Inventory.inventory();
        Map<Integer, ArrayList<String>> product_description = Product.products();

        System.out.println("Enter your purchase (in the format 'ID|Name|Quantity'):");
        int[] purchase = Rack.rack();

        int id = purchase[0];
        int quantity = purchase[1];
        String name = product_description.get(id).get(0);
        double price = Double.parseDouble(product_description.get(id).get(1).substring(1));
        double total_price = price * quantity;
        String offer_id = "";
        double net_price = total_price;

        if (stock.containsKey(id) && stock.get(id) >= quantity) {
            stock.put(id, stock.get(id) - quantity);
            System.out.println("\n== Bill ==");
            System.out.printf("%-12d %-20s %-25d %-12.2f %-10s %-10.2f\n", id, name, quantity, price, offer_id, net_price);
            System.out.println("\n== Total ==");
            System.out.printf("%-12s %-20s %-25s %-12s %-10s %-10.2f\n", "", "", "", "", "", net_price);
            System.out.println("========");
        } else {
            System.out.println("Sorry, the requested quantity is not available in the stock.");
        }
    }
}

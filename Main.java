package oop;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)  throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n====ENTER THE COMMAND====");
        String commands = sc.nextLine();
        commands = commands.toUpperCase();
        switch(commands)
        {
            case "SALES":
                Inventory.inventory();
                break;
            case "PRODUCTS"://FOR UPDATING & ADDING THE PRODUCTS
                Product.products();
                break;
            case "OFFERS":
                Offer.offer();
            case "BILL":
                Bill.bills();
            default:
                System.out.println("no match");
        }
        sc.close();
    }
}

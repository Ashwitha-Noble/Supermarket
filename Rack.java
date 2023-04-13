package oop;
import java.util.Scanner;
public class Rack extends Product 
{
    public static int[] rack()
    {
        Scanner cart = new Scanner(System.in);        //System.out.println("\n====ENTER THE COMMAND====");
        String  purchase = cart.nextLine();
        String[] parts = purchase.split("\\|");
        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        int quantity = Integer.parseInt(parts[2]);
        return new int[] {id , quantity};   
    }
}

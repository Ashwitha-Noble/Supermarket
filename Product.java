package oop;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Product extends Inventory
{
    Scanner sc = new Scanner(System.in);
    public static Map products() 
    {
        Map<Integer,ArrayList<String>> Product_description=new HashMap<Integer,ArrayList<String>>();
    
        Product_description.put(1, new ArrayList<String>());
        Product_description.put(2, new ArrayList<String>());
        Product_description.put(3, new ArrayList<String>());
    
        Product_description.get(1).add("Gooday");
        Product_description.get(1).add("₹15");
        //Product_description.get(1).add("5");

        Product_description.get(2).add("ParlieG");
        Product_description.get(2).add("₹20");

        Product_description.get(3).add("Potato");
        Product_description.get(3).add("₹50");
        //Product_description.get(2).add("3");
        System.out.println("PRODUCT DETAILS: ");

        for(Map.Entry<Integer,ArrayList<String>> entry: Product_description.entrySet())
        {
            Integer key=entry.getKey();
            ArrayList<String> values=entry.getValue();
            System.out.println((key+"|"+values).replace(",", "|").replace("[", "").replace("]", ";").replace(" ", ""));
        }
        return Product_description ;
    }
}
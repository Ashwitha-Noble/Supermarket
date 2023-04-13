package oop;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory
{
    public static Map inventory() 
    {
        HashMap<Integer, Integer> stock = new HashMap<>();
        stock.put(1, 5);
        stock.put(2, 3);
        stock.put(3,10);

        //return stock;
        System.out.println("SALES");
        System.out.println((""+stock+"\n").replace("=", "|").replace(",", ";").replace("{", "").replace("}", "").replace(" ", ""));
        return stock;
    }
}
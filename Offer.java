package oop;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Offer 
{
    public static Integer offer()
    {
        HashMap<Integer, String> discount_offer = new HashMap<>();
        Integer dis=0;
        for (Map.Entry<Integer, String> entry : discount_offer.entrySet()) 
        {
            Integer k = entry.getKey();
            String v = (entry.getValue().replace("%", ""));
            System.out.println(( k +"|"+v+"%;"));
            dis = Integer.parseInt(v);
            return dis;
        }
        return dis;
    }
}

import java.io.*;
import java.util.*;

public class Solution {
     public static Gadget getGadgetByCategory(Gadget[] arr, String category) {
        for (Gadget g : arr) {
         
            if (g.getCategory().equalsIgnoreCase(category)) {
                return g;
            }
        }
        return null; 
     }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Gadget[] arr = new Gadget[n];

        for (int i = 0; i < n; i++) {
            int mn = sc.nextInt();        
            String category = sc.next();     
            int wyears = sc.nextInt();        
            double cost = sc.nextDouble();

            arr[i] = new Gadget(mn, category, wyears, cost);
        }

        
        String search = sc.next();

        Gadget result = getGadgetByCategory(arr, search);

       
        if (result != null) {
           
            System.out.println(result.getModelNumber());
            System.out.println(result.getCategory());
            System.out.println(result.getWyears());
            System.out.println(result.getCost());
        } else {
           
            System.out.println("No Gadget Found");
        }

        sc.close();
  
    }
}

class Gadget {
    private int mn;
    private String category;
    private int wyears;
    private double cost;

    public Gadget(int mn, String category, int wyears, double cost) {
        this.mn = mn;
        this.category = category;
        this.wyears = wyears;
        this.cost = cost;
    }

    // getters
    public int getModelNumber() {
        return mn;
    }

    public String getCategory() {
        return category;
    }

    public int getWyears() {
        return wyears;
    }

    public double getCost() {
        return cost;
    }
}

package ru.Ryabov.OOP.seminar1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<HotDrink> products = new HashSet<>();
        HotDrink prod1 = new HotDrink(100.00, "coffee", 0.2, 36.6);
        HotDrink prod2 = new HotDrink(95.50, "Green tea", 0.3, 35.0);
        HotDrink prod3 = new HotDrink(85.00, "Black tea", 0.3, 35.0);

        products.add(prod1);
        products.add(prod2);
        products.add(prod3);

        for (HotDrink prod : products) {
            System.out.println("\nPrice: " + prod.getPrice() +
                    "\nName: " + prod.getName() +
                    "\nVolume: " + prod.getVolume() +
                    "\nTemp: " + prod.getTemp()
            );
        }



    }
}

package main.java.com.solvd.rentalcompany;

import java.util.ArrayList;

public interface ISeller {
    ArrayList<Buyable> inventory = new ArrayList<Buyable>();
    Buyable buyItem(Buyable item, double money);
    boolean hasItem(Buyable item);
    boolean addItem(Buyable item);
    boolean deleteItems(Buyable item);

}
//Implement with class Buyable and class Counter
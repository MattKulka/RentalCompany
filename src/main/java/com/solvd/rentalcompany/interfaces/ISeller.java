package main.java.com.solvd.rentalcompany.interfaces;

import main.java.com.solvd.rentalcompany.abstractClasses.Buyable;

import java.util.ArrayList;

public interface ISeller {
    ArrayList<Buyable> inventory = new ArrayList<Buyable>();
    Buyable buyItem(Buyable item, double money);
    boolean hasItem(Buyable item);
    boolean addItem(Buyable item);
    boolean deleteItems(Buyable item);

    //[TODO]Matt: Implement with class Buyable and class Counter
}

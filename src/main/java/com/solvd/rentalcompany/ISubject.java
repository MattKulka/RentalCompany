package main.java.com.solvd.rentalcompany;

import java.util.ArrayList;

public interface ISubject {
    ArrayList<IObserver> observers = new ArrayList<IObserver>();

    void addObserver(IObserver observer);
    void deleteObserver(IObserver observer);
    void notifyObserver();

}

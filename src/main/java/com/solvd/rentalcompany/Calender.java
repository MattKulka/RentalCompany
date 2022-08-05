package main.java.com.solvd.rentalcompany;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


//Fix Calender class and figure out how to implement it into main class


public class Calender {

    public LocalDate date;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");



    public Calender(int month, int day, int year){
        this.date = date.of(year, month, day);

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public String toString() {
        return super.toString();
    }

}
//Implement a way to receive a return date for the vehicle
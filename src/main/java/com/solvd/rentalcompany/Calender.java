package main.java.com.solvd.rentalcompany;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Calender {

    private ArrayList<RentalPeriod> date;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");

    public Calender(int month, int day, int year){
        this.date = new ArrayList<RentalPeriod>();

    }

}

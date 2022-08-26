package com.solvd.rentalcompany;
import com.solvd.rentalcompany.entities.Car;
import com.solvd.rentalcompany.entities.ElectricVehicles;
import com.solvd.rentalcompany.entities.GasVehicles;
import com.solvd.rentalcompany.entities.Person;
import com.solvd.rentalcompany.services.Calender;
import com.solvd.rentalcompany.services.Counter;
import com.solvd.rentalcompany.services.Garage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args){

        Person person1 = new Person("Matt", "Kulka");
        Person person2 = new Person("James", "Miller");

        Car car1 = new Car("Ford Bronco", 2022, person1);
        Car car2 = new Car("Tesla Model X", 2021, person2);

        logger.debug("Some debug log");
        logger.info("Person1: " + person1);
        logger.info("Car2: " + car2);
        logger.warn("Warning accrued at " + LocalDateTime.now());
        logger.error("Error accrued at " + LocalDateTime.now());
        logger.fatal("Serious problem with car " + car1 + " accrued at " + LocalDateTime.now());

        Scanner keyboard = new Scanner(System.in);
        Calender calender = new Calender(8,2,2022);
        Garage garage = new Garage();
        Counter.welcomeMessage();
        Counter.rentalDays();
    }
}

package com.solvd.rentalcompany.classes;
import com.solvd.rentalcompany.classes.Car;
import com.solvd.rentalcompany.classes.Person;
import com.solvd.rentalcompany.classes.Calender;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args){

        Person person1 = new Person("John", "Gold");
        Person person2 = new Person("James", "Miller");
        // create 2 cars
        Car car1 = new Car("Tesla Model S", 2020, person1);
        Car car2 = new Car("Tesla Model X", 2020, person2);
        // logging
        logger.debug("Some debug log");
        logger.info("Person1: " + person1);
        logger.info("Car2: " + car2);
        logger.warn("Warning accrued at " + LocalDateTime.now());
        logger.error("Error accrued at " + LocalDateTime.now());
        logger.fatal("Serious problem with car " + car1 + " accrued at " + LocalDateTime.now());

        Scanner keyboard = new Scanner(System.in);
        Calender calender = new Calender(8,2,2022);
        Garage garage = new Garage();

        System.out.println("Welcome to Matts Super Awesome Vehicle Rental");
        System.out.print("How many days would you like to rent one of our vehicles for?");
        int days = keyboard.nextInt();

        System.out.println("For a " + days + " day rental we have many different options for you to choose from, what type of vehicle are you interested in renting?");
        System.out.println("[1] Gas Vehicles" );
        System.out.println("[2] Electric Vehicles");
        int value = keyboard.nextInt();

        if (value==1){
            System.out.println("Here is a list of our current gas vehicles that you can choose from");
            System.out.println(Arrays.toString(Garage.GasVehicles));
            System.out.println("Which vehicle would you like?");
            Garage.Gascars();
            System.out.println("Your Trip total is " + days * GasVehicles.GasVehiclePPD);
        }
        else if (value==2) {
            System.out.println("Here is a list of our current electric vehicles that you can choose from");
            System.out.println(Arrays.toString(Garage.ElectricVehicles));
            System.out.println("Which vehicle would you like?");
            System.out.println("Your Trip total is " + days * ElectricVehicles.ElectricVehiclePPD);
        }


    }
}
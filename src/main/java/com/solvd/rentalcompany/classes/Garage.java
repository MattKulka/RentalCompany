package com.solvd.rentalcompany.classes;

import java.util.Scanner;
public class Garage {

    public static String[] GasVehicles = {" [1] Land Rover Defender", " [2] Land Rover Sport", " [3] Jeep Wrangler", " [4] Jeep Compass",
            " [5] Jeep Wagoneer", " [6] Jeep Gladiator", " [7] Ford Bronco", " [8] Ford Ranger",
            " [9] Subaru Outback", " [10] Subaru Forester"};


    public static String[] ElectricVehicles = {"[1] Tesla Model 3", "[2] Tesla Model S", "[3] Tesla Model X"};
    public static void Gascars() {

        Scanner keyboard = new Scanner(System.in);
        int gasChoice = keyboard.nextInt();
        switch (gasChoice) {
            case 1:
                System.out.println(" Land Rover Defender ");
                com.solvd.rentalcompany.classes.Counter.Addon();
                break;

            case 2:
                System.out.println(" Land Rover Sport ");
                com.solvd.rentalcompany.classes.Counter.Addon();
                break;

            case 3:
                System.out.println(" Jeep Wrangler ");
                com.solvd.rentalcompany.classes.Counter.Addon();
                break;

            case 4:
                System.out.println(" Jeep Compass ");
                com.solvd.rentalcompany.classes.Counter.Addon();
                break;

            case 5:
                System.out.println(" Jeep Wagoneer ");
                com.solvd.rentalcompany.classes.Counter.Addon();
                break;

            case 6:
                System.out.println(" Jeep Gladiator ");
                com.solvd.rentalcompany.classes.Counter.Addon();
                break;

            case 7:
                System.out.println(" Ford Bronco ");
                com.solvd.rentalcompany.classes.Counter.Addon();
                break;

            case 8:
                System.out.println(" Ford Ranger ");
                com.solvd.rentalcompany.classes.Counter.Addon();
                break;

            case 9:
                System.out.println(" Subaru Outback ");
                com.solvd.rentalcompany.classes.Counter.Addon();
                break;

            case 10:
                System.out.println(" Subaru Forester ");
                com.solvd.rentalcompany.classes.Counter.Addon();
                break;

            default:
                System.out.println("Invalid Input");
        }
    }

    public static void Electriccars() {

        int electricChoice;
        Scanner Scanner = new Scanner(System.in);
        electricChoice = Scanner.nextInt();
        switch (electricChoice) {
            case 1:
                System.out.println("Tesla Model 3");
                com.solvd.rentalcompany.classes.Counter.Addon();
                break;

            case 2:
                System.out.println("Tesla Model S");
                com.solvd.rentalcompany.classes.Counter.Addon();
                break;

            case 3:
                System.out.println("Tesla Model X");
                com.solvd.rentalcompany.classes.Counter.Addon();
                break;

            default:
                System.out.println("Invalid Input");
                com.solvd.rentalcompany.classes.Counter.Addon();
                break;
        }
    }
    //[TODO]Matt: ADD INTERFACE SUBJECT TO BE OBSERVED BY GARAGE CLASS
}
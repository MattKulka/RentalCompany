package com.solvd.rentalcompany.services;

import com.solvd.rentalcompany.services.Counter;

import java.util.Scanner;
public class Garage {

    public static String[] GasVehicles = {" [1] Land Rover Defender", " [2] Land Rover Sport", " [3] Jeep Wrangler", " [4] Jeep Compass",
            " [5] Jeep Wagoneer", " [6] Jeep Gladiator", " [7] Ford Bronco", " [8] Ford Ranger",
            " [9] Subaru Outback", " [10] Subaru Forester"};

    public static String[] ElectricVehicles = {"[1] Tesla Model 3", "[2] Tesla Model S", "[3] Tesla Model X"};

    public static void gasChoice() {
        Scanner keyboard = new Scanner(System.in);
        int gasOption = keyboard.nextInt();
        switch (gasOption) {
            case 1:
                System.out.println(" Land Rover Defender ");
                break;

            case 2:
                System.out.println(" Land Rover Sport ");
                break;

            case 3:
                System.out.println(" Jeep Wrangler ");
                break;

            case 4:
                System.out.println(" Jeep Compass ");
                break;

            case 5:
                System.out.println(" Jeep Wagoneer ");
                break;

            case 6:
                System.out.println(" Jeep Gladiator ");
                break;

            case 7:
                System.out.println(" Ford Bronco ");
                break;

            case 8:
                System.out.println(" Ford Ranger ");
                break;

            case 9:
                System.out.println(" Subaru Outback ");
                break;

            case 10:
                System.out.println(" Subaru Forester ");
                break;

            default:
                System.out.println("Invalid Input");
        }
    }

    public static void electricChoice() {
        Scanner Scanner = new Scanner(System.in);
        int electricOption = Scanner.nextInt();
        switch (electricOption) {
            case 1:
                System.out.println("Tesla Model 3");
                break;

            case 2:
                System.out.println("Tesla Model S");
                break;

            case 3:
                System.out.println("Tesla Model X");
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}

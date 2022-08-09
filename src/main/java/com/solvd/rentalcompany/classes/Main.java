package main.java.com.solvd.rentalcompany.classes;

import main.java.com.solvd.rentalcompany.classes.Calender;
import main.java.com.solvd.rentalcompany.classes.Counter;
import main.java.com.solvd.rentalcompany.classes.Garage;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

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


            int gasChoice = keyboard.nextInt();

            switch(gasChoice){
                case 1:
                    System.out.println(" Land Rover Defender ");
                    Counter.Addon();
                    break;

                case 2:
                    System.out.println(" Land Rover Sport ");
                    Counter.Addon();
                    break;

                case 3:
                    System.out.println(" Jeep Wrangler ");
                    Counter.Addon();
                    break;

                case 4:
                    System.out.println(" Jeep Compass ");
                    Counter.Addon();
                    break;

                case 5:
                    System.out.println(" Jeep Wagoneer ");
                    Counter.Addon();
                    break;

                case 6:
                    System.out.println(" Jeep Gladiator ");
                    Counter.Addon();
                    break;

                case 7:
                    System.out.println(" Ford Bronco ");
                    Counter.Addon();
                    break;

                case 8:
                    System.out.println(" Ford Ranger ");
                    Counter.Addon();
                    break;

                case 9:
                    System.out.println(" Subaru Outback ");
                    Counter.Addon();
                    break;

                case 10:
                    System.out.println(" Subaru Forester ");
                    Counter.Addon();
                    break;


                default:
                    System.out.println("Invalid Input");

            }

        }

        else if (value==2) {
            System.out.println("Here is a list of our current electric vehicles that you can choose from");
            System.out.println(Arrays.toString(Garage.ElectricVehicles));
            System.out.println("Which vehicle would you like?");

            int electricChoice = keyboard.nextInt(); ;

            switch(electricChoice){
                case 1:
                    System.out.println("Tesla Model 3");
                    Counter.Addon();
                    break;

                case 2:
                    System.out.println("Tesla Model S");
                    Counter.Addon();
                    break;

                case 3:
                    System.out.println("Tesla Model X");
                    Counter.Addon();
                    break;

                default:
                    System.out.println("Invalid Input");
                    Counter.Addon();
                    break;


        }


        }



    }


        }








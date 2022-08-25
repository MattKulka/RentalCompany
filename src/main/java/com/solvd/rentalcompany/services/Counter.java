package com.solvd.rentalcompany.services;
import com.solvd.rentalcompany.Main;
import com.solvd.rentalcompany.abstractClasses.Buyable;
import com.solvd.rentalcompany.abstractClasses.Vehicle;
import com.solvd.rentalcompany.entities.ElectricVehicles;
import com.solvd.rentalcompany.entities.GasVehicles;
import com.solvd.rentalcompany.interfaces.ISeller;
import java.util.Arrays;
import java.util.Scanner;

public class Counter extends Main implements ISeller {

    public Vehicle vehicle;

    public static String[] VehicleAddOns = {"[1] GPS / Navigation", "[2] Child Seats", "[3] Extra Driver", "[4] Vehicle Insurance"};

    static int GpsPPD = 15;
    static int ChildSeatsPPD = 11;
    static int ExtraDriverPPD = 21;
    static int VehicleInsurancePPD = 25;
    static Scanner scanner = new Scanner(System.in);

    public static void welcomeMessage(){

        System.out.println("Welcome to Matts Super Awesome Vehicle Rental");
        System.out.print("How many days would you like to rent one of our vehicles for?");
    }

    public static void rentalDays() {

        Scanner keyboard = new Scanner(System.in);

        int days = keyboard.nextInt();

        System.out.println("For a " + days + " day rental we have many different options for you to choose from, what type of vehicle are you interested in renting?");
        System.out.println("[1] Gas Vehicles");
        System.out.println("[2] Electric Vehicles");

        int value = keyboard.nextInt();

        switch (value) {

            case 1:
                System.out.println("Here is a list of our current gas vehicles that you can choose from");
                System.out.println(Arrays.toString(Garage.GasVehicles));
                System.out.println("Which vehicle would you like?");
                Garage.gasChoice();
                break;

            case 2:
                System.out.println("Here is a list of our current electric vehicles that you can choose from");
                System.out.println(Arrays.toString(Garage.ElectricVehicles));
                System.out.println("Which vehicle would you like?");
                Garage.electricChoice();
        }

        System.out.println("Would you like any of our available add ons?");
        System.out.println(Arrays.toString(VehicleAddOns));

        int additional = scanner.nextInt();

        switch (additional) {
            case 1:
                int GpsCarPPD = (int) (GpsPPD + GasVehicles.GasVehiclePPD);
                System.out.println(" GPS / Navigation  is an additional $" + GpsPPD + " per day");
                System.out.println("Your total for the vehicle and Gps is $" + GpsCarPPD + " per day");
                System.out.println("This makes your trip total $" + days * GpsCarPPD );
                break;

            case 2:
                int ChildSeatCarPPD = (int) (ChildSeatsPPD + GasVehicles.GasVehiclePPD);
                System.out.println(" Child Seats are an additional $" + ChildSeatsPPD + " per day");
                System.out.println("Your total for the vehicle and a child seat is $" + ChildSeatCarPPD + " per day");
                System.out.println("This makes your trip total $" + days * ChildSeatCarPPD );
                break;

            case 3:
                int ExtraDriverCarPPD = (int) (ExtraDriverPPD + GasVehicles.GasVehiclePPD);
                System.out.println(" An extra Driver is an additional $" + ExtraDriverPPD + " per day");
                System.out.println("Your total for the vehicle and an Extra Driver is $" + ExtraDriverCarPPD + " per day");
                System.out.println("This makes your trip total $" + days * ExtraDriverCarPPD );
                break;

            case 4:
                int InsuranceCarPPD = (int) (VehicleInsurancePPD + GasVehicles.GasVehiclePPD);
                System.out.println(" Vehicle insurance is an additional $" + VehicleInsurancePPD + " per day");
                System.out.println("Your total for the vehicle and vehicle insurance is $" + InsuranceCarPPD + " per day");
                System.out.println("This makes your trip total $" + days * InsuranceCarPPD );
                break;
        }
    }

    @Override
    public Buyable buyItem(Buyable item, double money) {
        return null;
    }

    @Override
    public boolean hasItem(Buyable item) {
        return false;
    }

    @Override
    public boolean addItem(Buyable item) {
        return false;
    }

    @Override
    public boolean deleteItems(Buyable item) {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Counter)) {
            return false;
        }
        return super.equals(obj) && this.vehicle.equals(((Counter) obj).vehicle);
    }

    @Override
    public int hashCode() {
        int result = 5;
        result = result * 10 * this.hashCode();
        result = result * 10 + Math.round(this.hashCode());
        result = result * 10 + this.hashCode();
        return result;
    }

    @Override
    public String toString() {
        String Vehicles = null;
        final String s = null;
        return null;
    }
}

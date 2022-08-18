package com.solvd.rentalcompany.classes;

import com.solvd.rentalcompany.abstractClasses.Buyable;
import com.solvd.rentalcompany.interfaces.ISeller;
import com.solvd.rentalcompany.interfaces.ISeller;
import com.solvd.rentalcompany.abstractClasses.Buyable;
import java.util.Arrays;
import java.util.Scanner;

public class Counter extends Main implements ISeller {
    public static String[] VehicleAddOns = {"[1] GPS / Navigation", "[2] Child Seats", "[3] Extra Driver", "[4] Vehicle Insurance"};

    static int GpsPPD = 15;
    static int ChildSeatsPPD = 11;
    static int ExtraDriverPPD = 21;
    static int VehicleInsurancePPD = 25;
    static Scanner scanner = new Scanner(System.in);

    public static void Addon(){

        System.out.println("Would you like any of our available add ons?");
        System.out.println(Arrays.toString(VehicleAddOns ));

        int additional = scanner.nextInt();

        switch(additional){
            case 1:
                int GpsCarPPD = (int) (GpsPPD + GasVehicles.GasVehiclePPD);
                System.out.println(" GPS / Navigation  is an additional $" + GpsPPD +" per day");
                System.out.println("Your total is $"+  GpsCarPPD + " per day");
                break;

            case 2:
                int ChildSeatCarPPD = (int) (ChildSeatsPPD+ GasVehicles.GasVehiclePPD);
                System.out.println(" Child Seats are an additional $" + ChildSeatsPPD +" per day");
                System.out.println("Your total is $"+ ChildSeatCarPPD + " per day");
                break;

            case 3:
                int ExtraDriverCarPPD = (int) (ExtraDriverPPD + GasVehicles.GasVehiclePPD);
                System.out.println(" An extra Driver is an additional $" + ExtraDriverPPD +" per day");
                System.out.println("Your total is $"+ ExtraDriverCarPPD + " per day");

                break;

            case 4:
                int InsuranceCarPPD = (int) (VehicleInsurancePPD+ GasVehicles.GasVehiclePPD);
                System.out.println(" Vehicle insurance is an additional $" + VehicleInsurancePPD +" per day");
                System.out.println("Your total is $"+ InsuranceCarPPD + " per day");
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

//fix equals, hashcode, and to string

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

//[TODO]Matt: ADD INTERFACE OBSERVER TO OBSERVE GARAGE CLASS

}





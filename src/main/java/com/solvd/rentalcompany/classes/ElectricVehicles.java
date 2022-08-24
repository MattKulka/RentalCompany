package com.solvd.rentalcompany.classes;
import com.solvd.rentalcompany.abstractClasses.Vehicle;
import java.lang.Math;

public class ElectricVehicles extends Vehicle {

    public Vehicle vehicle;

    public ElectricVehicles(int x, int y) {
        super(x, y);
    }

    public ElectricVehicles(int x, int y, Vehicle vehicle) {
        super(x, y);
        this.vehicle = vehicle;

    }

    public static int ElectricVehiclePPD = 200;

    //fix equals, hashcode, and to string (understand better)
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ElectricVehicles)) {
            return false;
        }
        return super.equals(obj) && this.vehicle.equals(((ElectricVehicles) obj).vehicle);
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

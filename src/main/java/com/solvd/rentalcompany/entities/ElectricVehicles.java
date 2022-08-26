package com.solvd.rentalcompany.entities;
import com.solvd.rentalcompany.abstractClasses.Vehicle;
import java.lang.Math;

public class ElectricVehicles{

    public Vehicle vehicle;

    public static int ElectricVehiclePPD = 200;

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

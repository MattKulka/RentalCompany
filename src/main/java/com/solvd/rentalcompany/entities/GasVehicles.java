package com.solvd.rentalcompany.entities;

import com.solvd.rentalcompany.abstractClasses.Vehicle;

public class GasVehicles extends Vehicle{

     public Vehicle vehicle;


     public static double GasVehiclePPD = 200;

     public GasVehicles(int x, int y) {
          super(x, y);
     }

     @Override
     public boolean equals(Object obj) {
          if (!(obj instanceof GasVehicles)) {
               return false;
          }
          return super.equals(obj) && this.vehicle.equals(((GasVehicles) obj).vehicle);
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

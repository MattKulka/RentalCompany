package com.solvd.rentalcompany.classes;

import com.solvd.rentalcompany.abstractClasses.Vehicle;

public class GasVehicles extends Vehicle {

     public static double GasVehiclePPD = 199.99;


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

}

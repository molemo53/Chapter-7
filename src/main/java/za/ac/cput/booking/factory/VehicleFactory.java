package za.ac.cput.booking.factory;

import za.ac.cput.booking.domain.Customer;
import za.ac.cput.booking.domain.ServicePackage;
import za.ac.cput.booking.domain.Services;
import za.ac.cput.booking.domain.Vehicle;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/05/05.
 */
public class VehicleFactory {
    public static Vehicle createVehicle(
            String make,String model)
    {
        Vehicle vehicle = new Vehicle
                .Builder(make)
                .model(model)
                .build();


        return vehicle;
    }
}

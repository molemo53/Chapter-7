package za.ac.cput.booking.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.booking.domain.Vehicle;
import za.ac.cput.booking.respository.VehicleRepository;
import za.ac.cput.booking.services.VehicleService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/17.
 */
@Service
public class VehicleServiceImpl implements VehicleService{
    @Autowired
    private VehicleRepository repository;


    public List<Vehicle> getVehicle()
    {
        List <Vehicle> allVehicle = new ArrayList<Vehicle>();
        Iterable <Vehicle>   vehicles = repository.findAll();

        for(Vehicle vehicle: vehicles)
        {
            allVehicle.add(vehicle);
        }
        return allVehicle;
    }
}

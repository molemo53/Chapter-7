package za.ac.cput.booking.repository;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.booking.App;
import za.ac.cput.booking.domain.Vehicle;
import za.ac.cput.booking.factory.VehicleFactory;
import za.ac.cput.booking.respository.VehicleRepository;

/**
 * Created by student on 2015/05/17.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class TestCrudVehicle {

    @Autowired
    private VehicleRepository repository;
    @Test
    public void testCreateVehicle() throws Exception
    {

        Vehicle vehicle = VehicleFactory
                .createVehicle("Bmw", "M 3");
        Assert.assertEquals("Bmw", vehicle.getMake());
        Assert.assertEquals("M 3",vehicle.getModel());
    repository.save(vehicle);
        repository.delete(vehicle);
    }
}

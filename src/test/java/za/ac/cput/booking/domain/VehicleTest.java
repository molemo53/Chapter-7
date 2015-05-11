package za.ac.cput.booking.domain;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.booking.factory.VehicleFactory;

/**
 * Created by student on 2015/05/07.
 */
public class VehicleTest {
    @Test
    public void testCreateVehicle() throws Exception
    {

        Vehicle vehicle = VehicleFactory
                .createVehicle("Bmw", "M 3");
        Assert.assertEquals("Bmw", vehicle.getMake());
        Assert.assertEquals("M 3",vehicle.getModel());

    }

    @Test
    public void testCreateVehicleUpdate() throws Exception
    {

        Vehicle vehicle = VehicleFactory
                .createVehicle("Bmw", "M 3");
        Assert.assertEquals("Bmw", vehicle.getMake());
        Assert.assertEquals("M 3",vehicle.getModel());

        Vehicle copyVehicle = new Vehicle.Builder("Bmw").copy(vehicle).model("M 3").build();
        Assert.assertEquals("Bmw", vehicle.getMake());
        Assert.assertEquals("M 3",vehicle.getModel());

        Assert.assertEquals("M 3",copyVehicle.getModel());
    }

}

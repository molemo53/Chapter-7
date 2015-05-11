package za.ac.cput.booking.domain;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.booking.factory.ServicePartFactory;

/**
 * Created by student on 2015/05/07.
 */
public class ServicePartTest {

    @Test
    public void testCreateServicePart() throws Exception
    {

        ServicePart servicePart = ServicePartFactory
                .createServicePart("Brakes", 1000);
        Assert.assertEquals("Brakes", servicePart.getItemPart());
        Assert.assertEquals(1000,1000, servicePart.getPrice());

    }

    @Test
    public void updateServicePart() throws Exception
    {

        ServicePart servicePart = ServicePartFactory
                .createServicePart("Brakes", 1000);
        Assert.assertEquals("Brakes", servicePart.getItemPart());
        Assert.assertEquals(1000,1000,servicePart.getPrice());


        ServicePart copyServicePart = new ServicePart.Builder("Brakes").copy(servicePart).price(1000).build();


        Assert.assertEquals(1000, 1000,copyServicePart.getPrice());
    }
}

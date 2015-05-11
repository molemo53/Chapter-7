package za.ac.cput.booking.domain;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.booking.factory.ServicePackageFactory;

/**
 * Created by student on 2015/05/07.
 */
public class ServicePackageTest {

    @Test
    public void testCreateServicePackage() throws Exception
    {

        ServicePackage servicePackage = ServicePackageFactory
                .createPackage("W11", "Warrenty");
        Assert.assertEquals("W11", servicePackage.getPackageCode());
        Assert.assertEquals("Warrenty", servicePackage.getPackageName());

    }

    @Test
    public void testUpdate() throws  Exception {

        ServicePackage servicePackage =  ServicePackageFactory
                .createPackage("W11", "Warrenty");
        ServicePackage copyServicePackage = new  ServicePackage
                .Builder("W11").copy(servicePackage).packageName("Warrenty").build();
        Assert.assertEquals("W11", copyServicePackage.getPackageCode());

    }
}

package za.ac.cput.booking.domain;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.booking.factory.ServiceShopFactory;

/**
 * Created by student on 2015/05/07.
 */
public class ServiceShopTest {

    @Test
    public void testCreateServiceShopTest() throws Exception
    {

        ServiceShop serviceShop = ServiceShopFactory
                .createServiceShop("Pretoria", "012123434");
        Assert.assertEquals("Pretoria", serviceShop.getShopName());
        Assert.assertEquals("012123434", serviceShop.getContact());

    }

    @Test
    public void testUpdate() throws  Exception {

        ServiceShop serviceShop = ServiceShopFactory
                .createServiceShop("Pretoria", "012123434");
        Assert.assertEquals("Pretoria", serviceShop.getShopName());
        Assert.assertEquals("012123434", serviceShop.getContact());

        ServiceShop copyServiceShop = new  ServiceShop
                .Builder("Pretoria").copy(serviceShop).contact("012123434").build();
        Assert.assertEquals("Pretoria", copyServiceShop.getShopName());

    }
}

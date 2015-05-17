package za.ac.cput.booking.repository;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.booking.App;
import za.ac.cput.booking.domain.ServiceShop;
import za.ac.cput.booking.factory.ServiceShopFactory;
import za.ac.cput.booking.respository.ServiceShopRepository;

/**
 * Created by student on 2015/05/17.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class TestCrudShop {

    @Autowired
    private ServiceShopRepository repository;
    @Test
    public void testCreateServiceShopTest() throws Exception
    {

        ServiceShop serviceShop = ServiceShopFactory
                .createServiceShop("Pretoria", "012123434");
        repository.save(serviceShop);
        Assert.assertEquals("Pretoria", serviceShop.getShopName());
        Assert.assertEquals("012123434", serviceShop.getContact());
        repository.delete(serviceShop);

    }

}

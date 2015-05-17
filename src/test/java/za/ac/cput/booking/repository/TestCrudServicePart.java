package za.ac.cput.booking.repository;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.booking.App;
import za.ac.cput.booking.domain.ServicePart;
import za.ac.cput.booking.factory.ServicePartFactory;
import za.ac.cput.booking.respository.ServicePartRepository;

/**
 * Created by student on 2015/05/17.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class TestCrudServicePart {

    @Autowired
    private ServicePartRepository repository;
    @Test
    public void testCreateServicePart() throws Exception
    {

        ServicePart servicePart = ServicePartFactory
                .createServicePart("Brakes", 1000);
        Assert.assertEquals("Brakes", servicePart.getItemPart());
        Assert.assertEquals(1000,1000, servicePart.getPrice());
        repository.save(servicePart);
        repository.delete(servicePart);


    }
}

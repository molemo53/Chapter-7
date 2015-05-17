package za.ac.cput.booking.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.booking.App;
import za.ac.cput.booking.domain.ServicePackage;
import za.ac.cput.booking.factory.ServicePackageFactory;
import za.ac.cput.booking.respository.ServicePackageRepository;
import za.ac.cput.booking.respository.ServiceRepository;

/**
 * Created by student on 2015/05/17.
 */

@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class TestcrudServicePackage extends AbstractTestNGSpringContextTests {

    @Autowired
    private ServicePackageRepository repository;
    @Test
    public void testCreateServicePackage() throws Exception
    {

      ServicePackage servicePackage = ServicePackageFactory
            .createPackage("W11", "Warrenty");

        repository.save(servicePackage);
        Assert.assertEquals("W11", servicePackage.getPackageCode());
        Assert.assertEquals("Warrenty", servicePackage.getPackageName());
        repository.delete(servicePackage);
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

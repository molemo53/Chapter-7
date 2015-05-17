package za.ac.cput.booking.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.booking.App;
import za.ac.cput.booking.domain.ServicePackage;
import za.ac.cput.booking.factory.ServicePackageFactory;
import za.ac.cput.booking.respository.ServicePackageRepository;
import za.ac.cput.booking.services.ServicePackageService;

import java.util.List;

/**
 * Created by student on 2015/05/17.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class PackageTest {
    @Autowired
    private ServicePackageRepository repository;


    @Autowired
    private ServicePackageService service;
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
    public void testGetPackage() throws Exception {
        List<ServicePackage> servicePackages = service.getServicePackage();
        Assert.assertTrue(servicePackages.size() == 2);

    }
}

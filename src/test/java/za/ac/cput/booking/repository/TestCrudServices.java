package za.ac.cput.booking.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.booking.App;
import za.ac.cput.booking.domain.ServicePackage;
import za.ac.cput.booking.domain.Services;
import za.ac.cput.booking.factory.ServiceFactory;
import za.ac.cput.booking.respository.ServiceRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/05/07.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class TestCrudServices {

    @Autowired
    ServiceRepository repository;

    @Test
    public void testCreate() throws Exception {
        List<Services> serviceses = new ArrayList<Services>();
        Services services = new Services
                .Builder("111")
                .serviceName("Oil Filter")
                .car("Bmw")
                .build();
        repository.save(services);
        Assert.assertNotNull(services.getId());

    }
}

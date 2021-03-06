package za.ac.cput.booking.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.booking.App;
import za.ac.cput.booking.domain.Services;
import za.ac.cput.booking.respository.ServiceRepository;
import za.ac.cput.booking.services.ServiceService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class ServicesTest {

    private ServiceService service;
    private Long id;
    @Autowired
    private ServiceRepository repository;
    private List<Services> serviceses;

    @Test
    public void create() throws Exception {
        List<Services> serviceses = new ArrayList<Services>();
        Services services = new Services
                .Builder("111")
                .serviceName("Oil Filter")
                .car("Bmw")
                .build();
        repository.save(services);
        Assert.assertNotNull(services.getId());

    }

    @org.junit.After
    public void read() throws Exception
    {
        Services services = repository.findOne(id);
        Assert.assertEquals("Oil Filter",services.getServiceName());
    }

    @org.junit.After
    public void update() throws Exception
    {
        Services services = repository.findOne(id);
        Services newService = new Services.Builder("111")
                .id(services.getId())
                .serviceName("Oil Filter")
                .car("Bmw")
                .build();
        repository.save(newService);

        Services updateService = repository.findOne(id);
        Assert.assertEquals("Oil Filter",updateService.getServiceName());

    }

    @Test
    public void delete() throws Exception
    {
        Services services = repository.findOne(id);
        repository.delete(services);
        Services updateServices = repository.findOne(id);
        Assert.assertNotNull(updateServices);
    }

    @Test
    public void testGetService() throws  Exception
    {   //serviceses = new ArrayList<Services>();
        serviceses = service.getServices(id);
        Assert.assertTrue(serviceses.size()==1);

    }
}

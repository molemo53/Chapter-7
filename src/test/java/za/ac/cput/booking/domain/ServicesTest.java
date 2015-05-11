package za.ac.cput.booking.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.booking.factory.ServiceFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/04/16.
 */
public class ServicesTest {

    @Before
    public void setUp() throws Exception
    {


    }

    @Test
    public void testCreateService() throws Exception {
        List<ServicePackage> servicePackages = new ArrayList<ServicePackage>();
        Map<String,String> values = new HashMap<String,String>();

        values.put("packageCode","S111");
        values.put("serviceName", "Oil Filtering");

        Services services = ServiceFactory.createServices(values, servicePackages);



        Assert.assertEquals("Oil Filtering", services.getServiceName());
    }

    @Test
    public void testUpdateService() throws Exception
    {
        List<ServicePackage> servicePackages = new ArrayList<ServicePackage>();
        Map<String,String> values = new HashMap<String,String>();

        values.put("packageCode","S111");
        values.put("serviceName", "Oil Filtering");

        Services services = ServiceFactory.createServices(values, servicePackages);

        Services newService = new Services
                .Builder(services.getServiceCode())
                .copy(services)
                .build();

        Assert.assertEquals("Oil Filtering", services.getServiceName());

        Assert.assertEquals("Oil Filtering", newService.getServiceName());

    }
}

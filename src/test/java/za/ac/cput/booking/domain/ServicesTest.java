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
    public void testCreateCourse() throws Exception {
        List<ServicePackage> servicePackages = new ArrayList<ServicePackage>();
        Map<String,String> values = new HashMap<String,String>();

        values.put("code","S111");
        values.put("name", "National Diploma");

      //  Services services = ServiceFactory.createServices(values, servicePackages);


       // Assert.assertEquals("S111", services.getServiceCode());
    }

    @Test
    public void testService() throws Exception
    {
        Services services = new Services.Builder("Molemo").service("Brakes").car("Ford").build();
        Assert.assertEquals("Brakes", services.getService());

    }
}

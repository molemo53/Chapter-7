package za.ac.cput.booking.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/04/16.
 */
public class ServicesTest {

    @Before
    public void setUp() throws Exception
    {


    }

    @Test
    public void testService() throws Exception
    {
        Services services = new Services.Builder("Molemo").service("Brakes").car("Ford").build();
        Assert.assertEquals("Brakes", services.getService());

    }
}

package za.ac.cput.booking.domain;

import junit.framework.Assert;
import org.junit.Test;
import za.ac.cput.booking.factory.CustomerFactory;

/**
 * Created by student on 2015/05/05.
 */
public class CustomerTest {

    @Test
    public void testCreate() throws Exception
    {
        Customer customer = CustomerFactory
                .createCustomer("Tseleng","Molemo");
        Assert.assertEquals("Tseleng",customer.getLastName());
        Assert.assertEquals("Molemo", customer.getFirstName());

    }

    @Test
    public void testUpdate() throws  Exception
    {
        Customer customer = CustomerFactory
                .createCustomer("Molemo","Tseleng");
        Customer copyCustomer = new Customer
                .Builder("Molemo").copy(customer).lastName("Tseleng").build();
                Assert.assertEquals("Tseleng", copyCustomer.getLastName());


    }
}


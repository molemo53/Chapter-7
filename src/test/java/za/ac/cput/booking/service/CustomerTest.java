package za.ac.cput.booking.service;

import junit.framework.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.booking.App;
import za.ac.cput.booking.domain.Customer;
import za.ac.cput.booking.factory.CustomerFactory;
import za.ac.cput.booking.respository.CustomerRepository;
import za.ac.cput.booking.services.CustomerService;

import java.util.List;

/**
 * Created by student on 2015/05/17.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class CustomerTest {
    @Autowired
    private CustomerRepository repository;

    @Autowired
    private CustomerService service;
    @Test
    public void testCreate() throws Exception
    {
        Customer customer = CustomerFactory
                .createCustomer("Tseleng", "Molemo");

        repository.save(customer);
        Assert.assertEquals("Tseleng", customer.getLastName());
        Assert.assertEquals("Molemo", customer.getFirstName());
        repository.delete(customer);
    }

    @Test
    public void testGetCustomer() throws  Exception
    {
        List<Customer > customers = service.getCustomer();
        Assert.assertTrue(customers.size() == 1);
    }
}

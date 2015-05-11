package za.ac.cput.booking.factory;

import za.ac.cput.booking.domain.Customer;
import za.ac.cput.booking.domain.Employee;

import java.util.Map;

/**
 * Created by student on 2015/05/04.
 */
public class CustomerFactory {
    public static Customer createCustomer(String lastName, String fistName)
    {
        Customer customer = new Customer
                .Builder(fistName)
                .lastName(lastName)
                .build();
        return customer;
    }
}

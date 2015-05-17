package za.ac.cput.booking.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.booking.domain.Customer;
import za.ac.cput.booking.respository.CustomerRepository;
import za.ac.cput.booking.services.CustomerService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/17.
 */
@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerRepository repository;


    public List<Customer> getCustomer()
    {
        List <Customer> allCustomer = new ArrayList<Customer>();
        Iterable <Customer>   customers = repository.findAll();

        for(Customer customer: customers)
        {
            allCustomer.add(customer);
        }
        return allCustomer;
    }
}

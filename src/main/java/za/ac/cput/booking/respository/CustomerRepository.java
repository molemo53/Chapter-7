package za.ac.cput.booking.respository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.booking.domain.Customer;

/**
 * Created by student on 2015/05/07.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}

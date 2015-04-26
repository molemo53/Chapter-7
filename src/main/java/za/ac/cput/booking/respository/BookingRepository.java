package za.ac.cput.booking.respository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.booking.domain.Services;

/**
 * Created by student on 2015/04/15.
 */
public interface BookingRepository extends CrudRepository<Services,String> {
public Services findCustomer(String customer);
}
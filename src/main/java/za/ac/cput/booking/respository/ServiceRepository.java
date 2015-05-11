package za.ac.cput.booking.respository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.booking.domain.Services;

/**
 * Created by student on 2015/05/07.
 */
public interface ServiceRepository extends CrudRepository<Services, Long> {

}

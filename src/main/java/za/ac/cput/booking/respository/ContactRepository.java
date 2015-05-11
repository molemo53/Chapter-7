package za.ac.cput.booking.respository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.booking.domain.ContactInformation;

/**
 * Created by student on 2015/05/07.
 */
public interface ContactRepository extends CrudRepository<ContactInformation, Long> {
}

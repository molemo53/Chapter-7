package za.ac.cput.booking.respository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.booking.domain.ServicePackage;

/**
 * Created by student on 2015/05/07.
 */
public interface ServicePackageRepository extends CrudRepository<ServicePackage, Long> {
}

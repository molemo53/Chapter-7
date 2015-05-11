package za.ac.cput.booking.respository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.booking.domain.Vehicle;

/**
 * Created by student on 2015/05/07.
 */
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
}

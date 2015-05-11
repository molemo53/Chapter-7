package za.ac.cput.booking.respository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.booking.domain.TestDrive;

/**
 * Created by student on 2015/05/07.
 */
public interface TestDriveRepository extends CrudRepository<TestDrive, Long> {
}

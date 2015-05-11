package za.ac.cput.booking.respository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.booking.domain.Invoice;

/**
 * Created by student on 2015/05/07.
 */
public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
}

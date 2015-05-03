package za.ac.cput.booking.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.booking.domain.Services;
import za.ac.cput.booking.respository.BookingRepository;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/04/16.
 */
public class ServiceImpl {

    @Autowired
    BookingRepository repository;

    public List<Services> getService() {
        List<Services> allService = new ArrayList<Services>();

        Iterable<Services> service = repository.findAll();
        for (Services services : service) {
            allService.add(services);
        }
        return allService;
    }
}

package za.ac.cput.booking.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.booking.domain.Services;
import za.ac.cput.booking.respository.ServiceRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/16.
 */
@Service
public class ServiceServiceImp {
    @Autowired
    ServiceRepository repository;
    public List<Services> getServices()
    {
        List<Services> allService = new ArrayList<Services>();
        Iterable<Services> serviceses = repository.findAll();
        for (Services service: serviceses)
        {
            allService.add(service);
        }
        return allService;

    }
}

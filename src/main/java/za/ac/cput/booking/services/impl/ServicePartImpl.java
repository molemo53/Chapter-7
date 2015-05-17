package za.ac.cput.booking.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.booking.domain.ServicePart;
import za.ac.cput.booking.respository.ServicePartRepository;
import za.ac.cput.booking.services.ServicePartService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/17.
 */
@Service
public class ServicePartImpl implements ServicePartService{
    @Autowired
    private ServicePartRepository repository;


    public List<ServicePart> getServicePart()
    {
        List <ServicePart> allparts = new ArrayList<ServicePart>();
        Iterable <ServicePart>   parts = repository.findAll();

        for(ServicePart part: parts)
        {
            allparts.add(part);
        }
        return allparts;
    }
}

package za.ac.cput.booking.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.booking.domain.ServicePackage;
import za.ac.cput.booking.respository.ServicePackageRepository;
import za.ac.cput.booking.services.ServicePackageService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/17.
 */
@Service
public class ServicePackageImpl implements ServicePackageService{
    @Autowired
    private ServicePackageRepository repository;


    public List<ServicePackage> getServicePackage()
    {
        List <ServicePackage> allpackages = new ArrayList<ServicePackage>();
        Iterable <ServicePackage>   packages= repository.findAll();

        for(ServicePackage servicePackage: packages)
        {
            allpackages.add(servicePackage);
        }
        return allpackages;
    }
}

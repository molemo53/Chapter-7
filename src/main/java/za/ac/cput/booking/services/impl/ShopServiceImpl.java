package za.ac.cput.booking.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.booking.domain.ServiceShop;
import za.ac.cput.booking.respository.ServiceShopRepository;
import za.ac.cput.booking.services.ShopService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/17.
 */
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ServiceShopRepository repository;


    public List<ServiceShop> getShop()
    {
        List <ServiceShop> allShops = new ArrayList<ServiceShop>();
        Iterable <ServiceShop>   shops = repository.findAll();

        for(ServiceShop shop: shops)
        {
            allShops.add(shop);
        }
        return allShops;
    }
}

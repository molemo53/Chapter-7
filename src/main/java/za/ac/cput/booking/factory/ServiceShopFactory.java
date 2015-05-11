package za.ac.cput.booking.factory;

import za.ac.cput.booking.domain.ContactInformation;
import za.ac.cput.booking.domain.ServiceShop;

/**
 * Created by student on 2015/05/05.
 */
public class ServiceShopFactory {

    public static ServiceShop createServiceShop(String shopName, String contact)
    {
        ServiceShop shop = new ServiceShop
                .Builder(shopName)
                .contact(contact)
                .build();

                return shop;
    }
}

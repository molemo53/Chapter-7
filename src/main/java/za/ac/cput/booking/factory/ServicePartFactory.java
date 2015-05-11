package za.ac.cput.booking.factory;

import za.ac.cput.booking.domain.ServicePart;

/**
 * Created by student on 2015/05/05.
 */
public class ServicePartFactory {

    public static ServicePart createServicePart(String itemPart, float price)
    {
        ServicePart servicePart = new ServicePart
                .Builder(itemPart)
                .price( price)
                .build();
        return  servicePart;
    }
}

package za.ac.cput.booking.factory;

import za.ac.cput.booking.domain.ServicePackage;
import za.ac.cput.booking.domain.Services;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/05/03.
 */
public class ServiceFactory {

    public static Services createServices(
                                      Map<String,String> values,
                                      List<ServicePackage> servicePackages)
    {
       Services services = new Services.Builder(values.get("serviceCode"))
               .serviceName(values.get("serviceName"))
               .servicePackages(servicePackages)
               .car(values.get("car"))
               .build();


        return services;
    }

}

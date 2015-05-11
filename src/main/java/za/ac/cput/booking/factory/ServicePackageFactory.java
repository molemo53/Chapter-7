package za.ac.cput.booking.factory;

import za.ac.cput.booking.domain.ServicePackage;

/**
 * Created by student on 2015/05/04.
 */
public class ServicePackageFactory {
    public static ServicePackage createPackage(String packageCode, String packageName)
    {
        ServicePackage servicePackage = new ServicePackage
                .Builder(packageCode)
                .packageName( packageName)
                .build();
        return  servicePackage;
    }
}

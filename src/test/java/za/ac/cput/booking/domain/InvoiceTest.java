package za.ac.cput.booking.domain;

import org.junit.Test;
import za.ac.cput.booking.factory.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/06.
 */
public class InvoiceTest {

    @Test
    public void testCreateInvoice() throws Exception
    {
        Customer customer = CustomerFactory
                .createCustomer("Tseleng", "Molemo");

        ServiceShop serviceShop = ServiceShopFactory
                .createServiceShop("Pretoria", "01202302324");

        Vehicle vehicle = VehicleFactory
                .createVehicle("Bmw", "1 Series");

        ServicePart servicePart = ServicePartFactory
                .createServicePart("Brakes",5000);


        //Invoice invoice = InvoiceFactory.createInvoice("10 April", serviceShop,customer,servicePart,vehicle);

    }

}

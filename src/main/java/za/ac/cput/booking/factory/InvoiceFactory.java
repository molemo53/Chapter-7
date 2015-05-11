package za.ac.cput.booking.factory;

import za.ac.cput.booking.domain.*;

import java.util.List;

/**
 * Created by student on 2015/05/05.
 */
public class InvoiceFactory {

    public  static Invoice createInvoice(String date, Vehicle vehicle,Customer customer, ServicePart servicePart, ServiceShop serviceShop)
    {

        Invoice invoice = new Invoice
                .Builder(date)
                .customer(customer)
                .serviceShop(serviceShop)
                .servicePart(servicePart)
                .build();

        return invoice;

    }
}

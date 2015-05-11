package za.ac.cput.booking.domain;

import junit.framework.Assert;
import org.junit.Test;
import za.ac.cput.booking.factory.CustomerFactory;
import za.ac.cput.booking.factory.EmployeeFactory;
import za.ac.cput.booking.factory.TestDriveFactory;
import za.ac.cput.booking.factory.VehicleFactory;

/**
 * Created by student on 2015/05/07.
 */
public class TestDriveTest {


    @Test
    public void testCreateTestDrive() throws Exception {
        Customer customer = CustomerFactory
                .createCustomer("Tseleng", "Molemo");

        Vehicle vehicle = VehicleFactory
                .createVehicle("Bmw", "1 Series");

        Employee employee = EmployeeFactory
                .createEmployee("Nyovest", "Cassper");


        TestDrive testDrive = TestDriveFactory
                .createTestDriveFactory("10 April", vehicle, customer, employee);

        Assert.assertEquals("Tseleng",customer.getLastName());
        Assert.assertEquals("Nyovest",employee.getLastName());

    }

}

package za.ac.cput.booking.repository;

import junit.framework.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.booking.App;
import za.ac.cput.booking.domain.Customer;
import za.ac.cput.booking.domain.Employee;
import za.ac.cput.booking.domain.TestDrive;
import za.ac.cput.booking.domain.Vehicle;
import za.ac.cput.booking.factory.CustomerFactory;
import za.ac.cput.booking.factory.EmployeeFactory;
import za.ac.cput.booking.factory.TestDriveFactory;
import za.ac.cput.booking.factory.VehicleFactory;
import za.ac.cput.booking.respository.TestDriveRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/17.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class TestCrudTestDrive {

    @Autowired
    TestDriveRepository repository;

   // private List<TestDrive> testDrives;

    @Test
    public void testCreateTestDrive() throws Exception {
        //testDrives = new ArrayList<TestDrive>();
        Customer customer = CustomerFactory
                .createCustomer("Tseleng", "Molemo");

        Vehicle vehicle = VehicleFactory
                .createVehicle("Bmw", "1 Series");

        Employee employee = EmployeeFactory
                .createEmployee("Nyovest", "Cassper");


        TestDrive testDrive = TestDriveFactory
                .createTestDriveFactory("10 April", vehicle, customer, employee);
        repository.save(testDrive);

        Assert.assertEquals("Tseleng", customer.getLastName());
        Assert.assertEquals("Nyovest",employee.getLastName());
        repository.delete(testDrive);

    }


}

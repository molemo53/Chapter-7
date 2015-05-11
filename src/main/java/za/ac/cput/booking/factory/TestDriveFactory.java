package za.ac.cput.booking.factory;

import za.ac.cput.booking.domain.Customer;
import za.ac.cput.booking.domain.Employee;
import za.ac.cput.booking.domain.TestDrive;
import za.ac.cput.booking.domain.Vehicle;

/**
 * Created by student on 2015/05/05.
 */
public class TestDriveFactory {

    public  static TestDrive createTestDriveFactory(String date, Vehicle vehicle,Customer customer, Employee employee)
    {

         TestDrive testDrive = new TestDrive
                .Builder(vehicle)
                 .date(date)
                .customer(customer)
                .employee(employee)
                .build();

        return testDrive;

    }
}

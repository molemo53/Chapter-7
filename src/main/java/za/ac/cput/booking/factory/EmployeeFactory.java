package za.ac.cput.booking.factory;

import za.ac.cput.booking.domain.Employee;

import java.util.Map;

/**
 * Created by student on 2015/05/04.
 */
public class EmployeeFactory {

    public static Employee createEmployee(String lastName, String firstName)
    {
        Employee employee = new Employee
                .Builder(lastName)
                .firstName(firstName)
                .build();
        return employee;
    }
}

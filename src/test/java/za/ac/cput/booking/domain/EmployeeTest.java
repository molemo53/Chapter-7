package za.ac.cput.booking.domain;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.booking.factory.EmployeeFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/05/05.
 */
public class EmployeeTest {

    @Test
    public void testCreateEmployee() throws Exception
    {

        Employee employee = EmployeeFactory
                .createEmployee("Tseleng", "Molemo");
        Assert.assertEquals("Tseleng",employee.getLastName());
        Assert.assertEquals("Molemo", employee.getFirstName());

    }

    @Test
    public void testUpdate() throws  Exception {

        Employee employee = EmployeeFactory
                .createEmployee("Tseleng", "Molemo");
        Employee copyEmployee = new Employee
                .Builder("Molemo").copy(employee).firstName("Tseleng").build();
        Assert.assertEquals("Tseleng", copyEmployee.getLastName());

    }

}

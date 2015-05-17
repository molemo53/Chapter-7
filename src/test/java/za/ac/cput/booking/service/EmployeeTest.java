package za.ac.cput.booking.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.booking.App;
import za.ac.cput.booking.domain.Employee;
import za.ac.cput.booking.respository.EmployeeRespository;
import za.ac.cput.booking.services.EmployeeService;

import java.util.List;

/**
 * Created by student on 2015/05/17.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class EmployeeTest {

    private Long id;
    @Autowired
    private EmployeeRespository repository;
    @Autowired
    private EmployeeService service;
    @Test
    public void testCreateEmployee() throws Exception
    {

        Employee employee = new Employee
                .Builder("molemo")
                .lastName("tseleng")
                .build();
        repository.save(employee);
        Assert.assertEquals("Tseleng", employee.getLastName());

        Assert.assertEquals("Molemo", employee.getFirstName());
        id=employee.getId();
        Assert.assertNotNull(employee);
        repository.delete(employee);

    }

    @Test
    public void testGetEmployee() throws Exception {
        List<Employee> employees = service.getEmployee();
        Assert.assertTrue(employees.size() == 2);

    }
}

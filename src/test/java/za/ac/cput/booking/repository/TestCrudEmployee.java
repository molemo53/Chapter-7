package za.ac.cput.booking.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.booking.App;
import za.ac.cput.booking.domain.Employee;
import za.ac.cput.booking.factory.EmployeeFactory;
import za.ac.cput.booking.respository.EmployeeRespository;

/**
 * Created by student on 2015/05/17.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class TestCrudEmployee {

    private Long id;
    @Autowired
    private EmployeeRespository repository;
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
    public void testUpdate() throws  Exception {

        Employee employee = EmployeeFactory
                .createEmployee("Tseleng", "Molemo");
        Employee copyEmployee = new Employee
                .Builder("Molemo").copy(employee).build();
        //Assert.assertEquals("Tseleng", copyEmployee.getLastName());


    }

}

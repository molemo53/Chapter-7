package za.ac.cput.booking.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.booking.domain.Employee;
import za.ac.cput.booking.respository.EmployeeRespository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/17.
 */
@Service
public class EmployeeServiceImpl {


    @Autowired
    private EmployeeRespository repository;


    public List<Employee> getEmployee()
    {
        List <Employee> allEmployee = new ArrayList<Employee>();
        Iterable <Employee>  employees = repository.findAll();

        for(Employee employee: employees)
        {
            allEmployee.add(employee);
        }
        return allEmployee;
    }
}

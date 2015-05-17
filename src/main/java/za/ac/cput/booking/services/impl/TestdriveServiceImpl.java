package za.ac.cput.booking.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.booking.domain.TestDrive;
import za.ac.cput.booking.respository.TestDriveRepository;
import za.ac.cput.booking.services.TestDriveService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/17.
 */
@Service
public class TestdriveServiceImpl implements TestDriveService{
    @Autowired
    private TestDriveRepository repository;


    public List<TestDrive> getTestDrive()
    {
        List <TestDrive> allTestDrive = new ArrayList<TestDrive>();
        Iterable <TestDrive>   testDrives = repository.findAll();

        for(TestDrive testDrive: testDrives)
        {
            allTestDrive.add(testDrive);
        }
        return allTestDrive;
    }
}

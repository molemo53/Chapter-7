package za.ac.cput.booking.repository;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.booking.App;
import za.ac.cput.booking.domain.ContactInformation;
import za.ac.cput.booking.factory.ContactFactory;
import za.ac.cput.booking.respository.ContactRepository;

/**
 * Created by student on 2015/05/15.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class TestCrudContact extends AbstractTestNGSpringContextTests {
    private Long id;
    @Autowired
    private ContactRepository repository;

    @Test
    public void create() throws Exception
    {
        ContactInformation contactInformation = ContactFactory
        .createContact("molemo@gmail.com","0837311339");
        Assert.assertEquals("molemo@gmail.com", contactInformation.getEmail());
        repository.save(contactInformation);
        repository.delete(contactInformation);
        Assert.assertNotNull(contactInformation);
    }
}

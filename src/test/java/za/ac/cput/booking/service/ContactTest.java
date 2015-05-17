package za.ac.cput.booking.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.booking.App;
import za.ac.cput.booking.domain.ContactInformation;
import za.ac.cput.booking.factory.ContactFactory;
import za.ac.cput.booking.respository.ContactRepository;
import za.ac.cput.booking.services.ContactService;

import java.util.List;

/**
 * Created by student on 2015/05/17.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class ContactTest {

    @Autowired
    private ContactService service;
    private Long id;
    @Autowired
    private ContactRepository repository;
    private ContactInformation contactInformation;
    @Test
    public void create() throws Exception
    {
         contactInformation = ContactFactory
                .createContact("molemo@gmail.com", "0837311339");
        Assert.assertEquals("molemo@gmail.com", contactInformation.getEmail());
        repository.save(contactInformation);
        repository.delete(contactInformation);
        Assert.assertNotNull(contactInformation);
    }

    @Test
    public void testGetConact() throws  Exception
    {
        List<ContactInformation > contactInformation = service.getContact();
        Assert.assertTrue(contactInformation.size()==1);
    }
}

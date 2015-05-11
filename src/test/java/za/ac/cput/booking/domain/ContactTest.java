package za.ac.cput.booking.domain;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.booking.factory.ContactFactory;

/**
 * Created by student on 2015/05/04.
 */
public class ContactTest {

    @Test
    public void testCreate() throws Exception
    {
        ContactInformation contact = ContactFactory
                .createContact("molemo@gmail.com","0837311339");
        Assert.assertEquals("molemo@gmail.com",contact.getEmail());
    }

    @Test
    public void testUpdate() throws Exception
    {
        ContactInformation contactInformation = ContactFactory
                .createContact("molemo@gmail.com", "0837311339");

            ContactInformation copyContact = new ContactInformation
                    .Builder("molemo@gmail.com").copy(contactInformation).cellNo("0837311339").build();
                Assert.assertEquals("molemo@gmail.com",contactInformation.getEmail());
                Assert.assertEquals("molemo@gmail.com",copyContact.getEmail());
                Assert.assertEquals("0837311339",contactInformation.getCellNo());
                Assert.assertEquals("0837311339",copyContact.getCellNo());
    }
}

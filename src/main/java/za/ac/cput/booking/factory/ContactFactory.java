package za.ac.cput.booking.factory;

import za.ac.cput.booking.domain.ContactInformation;

/**
 * Created by student on 2015/05/04.
 */
public class ContactFactory {

    public static ContactInformation createContact(String email, String cellNo)
    {
        ContactInformation contact = new ContactInformation
                .Builder(email)
                .cellNo(cellNo)
                .build();
        return contact;
    }
}

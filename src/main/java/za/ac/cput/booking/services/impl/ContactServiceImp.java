package za.ac.cput.booking.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.booking.domain.ContactInformation;
import za.ac.cput.booking.respository.ContactRepository;
import za.ac.cput.booking.services.ContactService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/17.
 */
@Service
public class ContactServiceImp implements ContactService {

    @Autowired
    private ContactRepository repository;


    public List<ContactInformation> getContact()
    {
        List <ContactInformation> allContact = new ArrayList<ContactInformation>();
        Iterable <ContactInformation>   contacts = repository.findAll();

        for(ContactInformation contact: contacts)
        {
            allContact.add(contact);
        }
        return allContact;
    }
}

package za.ac.cput.booking.services;

import za.ac.cput.booking.domain.Services;

import java.util.List;

/**
 * Created by student on 2015/05/16.
 */
public interface ServiceService {
    List<Services> getServices(Long id);
}
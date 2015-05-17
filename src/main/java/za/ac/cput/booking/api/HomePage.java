package za.ac.cput.booking.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.booking.domain.Services;
//import za.ac.cput.booking.services.ServiceService;

import java.util.List;

/**
 * Created by student on 2015/04/15.
 */
@RestController
@RequestMapping("/api/**")
public class HomePage {

    @Autowired
  //  private ServiceService service;
    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String Index(){
        return "This is a Home Page";
    }

    @RequestMapping(value = "serviceses",method = RequestMethod.GET)
    public Services getServices(){
        Services services = new Services.Builder("111").serviceName("Oil Filter").car("Bmw").build();

        return services;
    }



}

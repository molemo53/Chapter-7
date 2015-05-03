package za.ac.cput.booking.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by student on 2015/04/17.
 */
@Embeddable
public class Equipment implements Serializable{

    private String paint;
    private float price;

    public Equipment()
    {

    }

}

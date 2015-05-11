package za.ac.cput.booking.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 2015/04/15.
 */
@Entity
public class Invoice implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String date;
    @Embedded
    private Customer customer;

    @Embedded
    private Vehicle vehicle;
    @Embedded
    private ServiceShop serviceShop;
    @Embedded
    private ServicePart servicePart;


    private Invoice()
    {

    }

    public Invoice(Builder builder)
    {
        this.id=builder.id;
        this.date=builder.date;
        this.serviceShop=builder.serviceShop;
        this.servicePart=builder.servicePart;
        this.customer=builder.customer;
        this.vehicle=builder.vehicle;

    }

    public Long getId()
    {
        return id;
    }

    public ServiceShop getServiceShop()
    {
        return serviceShop;
    }

    public ServicePart getServicePart()
    {
        return  servicePart;
    }

    public Customer getCustomer()
    {
        return  customer;
    }

    public Vehicle getVehicle()
    {
        return  vehicle;
    }

    public String getDate() {return date;}

    public static class Builder
    {
        private Long id;
        private ServiceShop serviceShop;
        private  ServicePart servicePart;
        private Customer customer;
        private Vehicle vehicle;
        private String date;

        public Builder(String date)
        {
            this.date=date;
        }

        public Builder customer(Customer value)
        {
            this.customer=value;
            return this;
        }

        public Builder serviceShop(ServiceShop value)
        {
            this.serviceShop=value;
            return this;
        }

        public Builder servicePart(ServicePart value)
        {
            this.servicePart=value;
            return this;
        }

        public Builder id(Long value)
        {
            this.id=value;
            return this;
        }

        public Builder vehicle(Vehicle value)
        {
            this.vehicle=value;
            return  this;
        }

        public Builder copy(Invoice value)
        {
            this.id=value.id;
            this.date=value.date;
            this.serviceShop=value.serviceShop;
            this.servicePart=value.servicePart;
            this.vehicle=value.vehicle;
            this.customer=value.customer;
            return this;

        }

        public Invoice build()
        {
            return  new Invoice(this);
        }
    }
}

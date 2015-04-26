package za.ac.cput.booking.domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/15.
 */
public class TestDrive implements Serializable{

    private Long id;

    private Customer customer;
    private Vehicle vehicle;

    private TestDrive()
    {

    }

    public Long getId()
    {
        return  id;
    }
    public Customer getCustomer()
    {
       return customer;
    }

    public Vehicle getVehicle()
    {
        return vehicle;

    }

    public TestDrive(Builder builder)
    {
        this.id=builder.id;
        this.vehicle=builder.vehicle;
        this.customer=builder.customer;

    }

    public static class Builder{
        private Long id;
        private Customer customer;
        private Vehicle vehicle;

        public Builder(Long id)
        {
            this.id=id;

        }

        public Builder customer(Customer value)
        {
            this.customer=value;
            return  this;
        }

        public Builder vehicle (Vehicle value)
        {
            this.vehicle = value;
            return  this;
        }

        public Builder copy(TestDrive value)
        {
           this.id=value.getId();
            this.customer=value.getCustomer();
            this.vehicle=value.getVehicle();
            return this;
        }

        public TestDrive build()
        {
            return new TestDrive(this);
        }
    }
}

package za.ac.cput.booking.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by student on 2015/04/15.
 */
@Entity
public class TestDrive implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Embedded
    private Employee employee;
    @Embedded
    private Customer customer;
    @Embedded
    private Vehicle vehicle;

    private String date;

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
    public Vehicle getVehicle() {return vehicle;}
    public Employee getEmployee(){return employee;}
    public String getDate(){return  date;}


    public TestDrive(Builder builder)
    {
        this.id=builder.id;
        this.vehicle=builder.vehicle;
        this.customer=builder.customer;
        this.employee=builder.employee;
        this.date=builder.date;
    }

    public static class Builder{
        private Long id;
        private Customer customer;
        private Vehicle vehicle;
        private Employee employee;
        private String date;

        public Builder(Vehicle vehicle )
        {
            this.vehicle=vehicle;

        }

        public Builder customer(Customer value)
        {
            this.customer=value;
            return  this;
        }

        public Builder id(Long value)
        {
            this.id = value;
            return  this;
        }

        public Builder employee(Employee value)
        {
            this.employee =value;
            return  this;
        }

        public Builder date(String value)
        {
            this.date =value;
            return  this;
        }

        public Builder copy(TestDrive value)
        {
           this.id=value.getId();
            this.date=value.getDate();
            this.customer=value.getCustomer();
            this.vehicle=value.getVehicle();
            this.employee=value.getEmployee();
            return this;
        }

        public TestDrive build()
        {
            return new TestDrive(this);
        }
    }
}

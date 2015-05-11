package za.ac.cput.booking.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by student on 2015/04/15.
 */
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    private Customer ()
    {

    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public Long getId() {
        return id;
    }

    public Customer(Builder builder){
        id=builder.id;
        firstName=builder.firstName;
        lastName=builder.lastName;

    }

    public static class Builder{
        private Long id;
        private String firstName;
        private String lastName;



        public Builder(String firstName) {
            this.firstName = firstName;
        }

        public Builder lastName(String value){
            this.lastName=value;
            return this;
        }

        public Builder id(Long value){
            this.id=value;
            return this;
        }

        public Builder copy(Customer value){
            this.id=value.id;
            this.firstName=value.firstName;
            this.lastName=value.lastName;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

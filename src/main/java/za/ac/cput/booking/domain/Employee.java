package za.ac.cput.booking.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by student on 2015/04/15.
 */
//import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
public class Employee implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;


    private Employee()
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



    public Employee(Builder builder)
    {
        id=builder.id;
        firstName=builder.firstName;
        lastName=builder.lastName;

    }

    public static class Builder{
        private Long id;
        private String firstName;
        private String lastName;


        public Builder(String lastName) {
            this.lastName = lastName;
        }

        public Builder firstName(String value){
            this.firstName=value;
            return this;
        }

        public Builder id(Long value){
            this.id=value;
            return this;
        }

        public Builder copy(Employee value){
            this.id=value.id;
            this.firstName=value.firstName;
            this.lastName=value.lastName;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}

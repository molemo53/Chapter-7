package za.ac.cput.booking.domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/15.
 */
public class Vehicle implements Serializable{

    private Long id;
    private String make;
    private String model;
    private Customer customer;

    private Vehicle()
    {

    }

    public Vehicle(Builder builder)
    {

      make=builder.make;
        model=builder.model;
    }

    public Long getId() {
        return id;
    }

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public static class Builder {
        private Long id;
        private String make;
        private String model;

        public Builder(String make) {
            this.make = make;
        }

        public Builder model(String value){
            this.model=value;
            return this;
        }

        public Builder copy(Vehicle value){
            this.make=value.make;
            this.model=value.model;
            return this;
        }
    }
    }


package za.ac.cput.booking.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by student on 2015/04/15.
 */
@Entity
public class Vehicle implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String make;
    private String model;


    private Vehicle()
    {

    }

    public Vehicle(Builder builder)
    {
        id=builder.id;
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

        public Builder id(Long value){
            this.id=value;
            return this;
        }

        public Builder model(String value){
            this.model=value;
            return this;
        }



        public Builder copy(Vehicle value){
            this.id=value.id;
            this.make=value.make;
            this.model=value.model;
            return this;
        }

        public Vehicle build()
        {
            return new Vehicle(this);
        }
    }
    }


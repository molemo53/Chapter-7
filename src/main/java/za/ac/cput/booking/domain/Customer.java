package za.ac.cput.booking.domain;

/**
 * Created by student on 2015/04/15.
 */
public class Customer {

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

    public Customer(Builder builder){
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

        public Builder copy(Customer value){
            this.firstName=value.firstName;
            this.lastName=value.lastName;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }
}

package za.ac.cput.booking.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by student on 2015/04/15.
 */
@Entity
public class Invoice implements Serializable{

    @Id
    private String invoiceNum;
    private float amountOwed;
    private float amountPaid;

   private Customer customer;
    private Vehicle vehicle;

    private Invoice()
    {

    }

    public Invoice(Builder builder)
    {
        this.invoiceNum=builder.invoiceNum;
        this.amountOwed=builder.amountOwed;
        this.amountPaid=builder.amountPaid;
        this.customer=builder.customer;
        this.vehicle=builder.vehicle;

    }

    public String getInvoiceNum()
    {
        return invoiceNum;
    }

    public float getAmountOwed()
    {
        return  amountOwed;
    }

    public float getAmountPaid()
    {
        return  amountPaid;
    }

    public Customer getCustomer()
    {
        return  customer;
    }

    public Vehicle getVehicle()
    {
        return  vehicle;
    }

    public static class Builder
    {
        private String invoiceNum;
        private float amountOwed;
        private float amountPaid;
        private Customer customer;
        private Vehicle vehicle;

        public Builder(String invoiceNum)
        {
            this.invoiceNum=invoiceNum;
        }

        public Builder amountOwed(float value)
        {
            this.amountOwed=value;
            return this;
        }

        public Builder amountPaid(float value)
        {
            this.amountPaid=value;
            return this;
        }

        public Builder customer(Customer value)
        {
            this.customer=value;
            return this;
        }

        public Builder vehicle(Vehicle value)
        {
            this.vehicle=value;
            return  this;
        }

        public Builder copy(Invoice value)
        {
            this.invoiceNum=value.invoiceNum;
            this.amountOwed=value.amountOwed;
            this.amountPaid=value.amountPaid;
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

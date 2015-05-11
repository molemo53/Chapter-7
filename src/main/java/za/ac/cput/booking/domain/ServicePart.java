package za.ac.cput.booking.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by student on 2015/04/16.
 */
@Entity
public class ServicePart implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String itemPart;
    private float price;

    private ServicePart()
    {

    }

    public String getItemPart() {
        return itemPart;
    }

    public float getPrice() {
        return price;
    }

    public Long getId(){return id;}


    public ServicePart(Builder builder)
    {

        id=builder.id;
        itemPart=builder.itemPart;
        price=builder.price;

    }

    public static class Builder {
        private Long id;
        private String itemPart;
        private float price;

        public Builder(String itemPart) {
            this.itemPart = itemPart;
        }

        public Builder id(Long value)
        {
            this.id=value;
            return this;
        }

        public Builder price(float value)
        {
            this.price=value;
            return this;

        }

        public Builder copy(ServicePart value)
        {
            this.id=value.id;
            this.itemPart=value.itemPart;
            this.price=value.price;
            return this;
        }

        public ServicePart build()
        {
          return new ServicePart(this);
        }

    }

    @Override
    public String toString() {
        return "ServicePart{" +
                "itemPart='" + itemPart + '\'' +
                ", price=" + price +
                '}';
    }
}

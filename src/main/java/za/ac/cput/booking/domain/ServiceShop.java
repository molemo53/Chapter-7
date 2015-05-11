package za.ac.cput.booking.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 2015/05/04.
 */
@Entity
public class ServiceShop implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String shopName;
    private String contact;

    private ServiceShop()
    {

    }

    public Long getId() {
        return id;
    }

    public String getShopName() {
        return shopName;
    }

    public String getContact() {
        return contact;
    }

    public ServiceShop(Builder builder)
    {
        this.contact=builder.contact;
        this.id=builder.id;
        this.shopName=builder.shopName;
    }

    public static class Builder{
        private Long id;
        private String shopName;
        private String contact;

        public Builder(String shopName)
        {
            this.shopName=shopName;
        }

        public Builder id(Long value){
            this.id=value;
            return this;
        }


        public Builder contact( String value){
            this.contact=value;
            return this;
        }

        public Builder copy(ServiceShop value){
            this.id=value.id;
            this.shopName=value.shopName;
            this.contact=value.contact;

            return this;
        }

        public ServiceShop build()
        {
            return new ServiceShop(this);
        }

    }

    @Override
    public String toString() {
        return "ServiceShop{" +
                "shopName='" + shopName + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}

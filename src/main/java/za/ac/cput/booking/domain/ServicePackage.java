package za.ac.cput.booking.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by student on 2015/04/23.
 */
@Entity
public class ServicePackage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String packageCode;
    private String packageName;


    public ServicePackage(Builder builder)
    {
        this.id=builder.id;
        this.packageCode=builder.packageCode;
        this.packageName=builder.packageName;

    }

    public static class Builder
    {
        private Long id;
        private String packageName;
        private String packageCode;

        public Builder(String packageCode)
        {
            this.packageCode=packageCode;
        }

        public Builder id(Long value){
            this.id=value;
            return this;
        }

        public Builder packageName(String value){
            this.packageName=value;
            return this;
        }

        public Builder copy(ServicePackage value)
        {
            this.id=value.id;
            this.packageCode=value.packageCode;
            this.packageName=value.packageName;
            return this;
        }

        public ServicePackage build()
        {
            return  new ServicePackage(this);
        }
    }

    public Long getId() {
        return id;
    }

    public String getPackageCode() {
        return packageCode;
    }

    public String getPackageName() {
        return packageName;
    }

}

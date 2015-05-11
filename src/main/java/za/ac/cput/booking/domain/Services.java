package za.ac.cput.booking.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 2015/04/15.
 */

@Entity
public class Services implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String serviceName;
    @Column(unique = true)
    private String serviceCode;
    private String car;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="service_id")
    private List<ServicePackage> servicePackages;

    private Services(){
    }

    public Services(Builder builder)
    {
        id=builder.id;
        serviceName=builder.serviceName;
        serviceCode=builder.serviceCode;
        car=builder.car;
        servicePackages=builder.servicePackages;

    }

    public Long getId() {
        return id;
    }

    public String getServiceCode() {
        return serviceCode;
    }


    public String getServiceName() {
        return serviceName;
    }

    public String getCar() {
        return car;
    }

    public List<ServicePackage> getServicePackages() {return  servicePackages;}

    public static class Builder{
        private String serviceName;
        private String serviceCode;
        private String car;
        private Long id;
        private List<ServicePackage> servicePackages;


        public Builder(String serviceCode){
            this.serviceCode = serviceCode;
        }

        public Builder serviceName(String value) {
            this.serviceName=value;
            return  this;
        }

        public Builder id(Long value){
            this.id=value;
            return this;
        }

        public Builder car(String value) {
            this.car=value;
            return  this;
        }

        public Builder servicePackages(List<ServicePackage> value){
            this.servicePackages=value;
            return this;
        }

        public Builder copy(Services value)
        {
            this.id=value.getId();
            this.serviceName=value.getServiceName();
            this.serviceCode=value.getServiceCode();
            this.car=value.getCar();
            this.servicePackages=value.getServicePackages();
            return this;
        }

        public Services build()
        {
            return new Services(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Services)) return false;

        Services services = (Services) o;

        if (id != null ? !id.equals(services.id) : services.id  != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id  != null ? id .hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id=" + id +
                ", service='" + serviceName + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                ", car='" + car + '\'' +
                '}';
    }
}


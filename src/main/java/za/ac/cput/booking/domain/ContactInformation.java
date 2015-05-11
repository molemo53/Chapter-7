package za.ac.cput.booking.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by student on 2015/04/25.
 */
@Embeddable
public class ContactInformation implements Serializable {

    private String email;
    private String cellNo;

    private ContactInformation()
    {

    }

    public ContactInformation(Builder builder) {
        email=builder.email;
        cellNo=builder.cellNo;
    }

    public String getEmail() {
        return email;
    }

    public String getCellNo() {
        return cellNo;
    }

    public static class Builder{
        private String email;
        private String cellNo;

        public Builder(String email) {
            this.email = email;
        }

        public Builder cellNo(String value){
            this.cellNo=value;
            return this;
        }

        public Builder copy(ContactInformation value){
            this.cellNo=value.cellNo;
            this.email=value.email;
            return this;
        }

        public ContactInformation build(){
            return new ContactInformation(this);
        }
    }
}

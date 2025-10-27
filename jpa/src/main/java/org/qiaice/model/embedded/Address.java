package org.qiaice.model.embedded;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Address {
    private String streetName;
    private String houseNumber;
    private String zipCode;
}

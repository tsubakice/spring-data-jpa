package org.qiaice.model.embedded;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "`order`")
public class Order {

    @EmbeddedId
    private OrderId id;

    @Embedded
    private Address address;
    private String orderInfo;
    private String anotherField;
}

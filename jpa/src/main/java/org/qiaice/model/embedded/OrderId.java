package org.qiaice.model.embedded;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Embeddable
public class OrderId {
    private String uname;
    private LocalDateTime orderDate;
}

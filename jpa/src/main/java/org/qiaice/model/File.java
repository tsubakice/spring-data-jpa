package org.qiaice.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@DiscriminatorValue(value = "f")
@EqualsAndHashCode(callSuper = true)
public class File extends Resource {
    private Integer type;
}

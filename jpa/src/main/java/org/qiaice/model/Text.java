package org.qiaice.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@DiscriminatorValue(value = "t")
@EqualsAndHashCode(callSuper = true)
public class Text extends Resource {
    private String content;
}

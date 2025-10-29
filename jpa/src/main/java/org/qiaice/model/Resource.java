package org.qiaice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Resource extends BaseModel {

    private String name;

    private Integer size;

    private String url;
}

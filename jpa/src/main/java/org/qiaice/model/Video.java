package org.qiaice.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@DiscriminatorValue(value = "v") // 设置鉴别器值
@EqualsAndHashCode(callSuper = true)
public class Video extends Resource {
    private Integer length;
}

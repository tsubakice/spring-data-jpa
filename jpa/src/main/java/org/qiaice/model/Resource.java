package org.qiaice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED) // 指定继承策列为连接表策略，特点为子类均有自己的表，以外键的形式和父表关联
@EqualsAndHashCode(callSuper = true)
public class Resource extends BaseModel {

    private String name;

    private Integer size;

    private String url;
}

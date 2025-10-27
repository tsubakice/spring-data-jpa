package org.qiaice.model;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // 指定继承策列为单表继承，特点为子类字段必须可以为 null 且均生成于单表中
@DiscriminatorColumn(name = "resource_type") // 生成鉴别器列，存储子类生成的鉴别器值，可以判断数据是哪个子类插入的
@EqualsAndHashCode(callSuper = true)
public class Resource extends BaseModel {

    private String name;

    private Integer size;

    private String url;
}

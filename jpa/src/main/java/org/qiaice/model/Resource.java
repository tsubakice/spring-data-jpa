package org.qiaice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // 指定继承策略为 TABLE_PER_CLASS，特点为子类均有自己的表，且继承了父表的所有字段
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE) // 切记如果继承策略为 TABLE_PER_CLASS，那么 id 生成策略就不能是 IDENTITY
    private Integer id;

    private String name;

    private Integer size;

    private String url;
}

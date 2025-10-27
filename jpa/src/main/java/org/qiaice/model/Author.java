package org.qiaice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity // 以当前实体类为模板，生成数据表
@Table(name = "author") // 修改表的一些设置，比如表名
public class Author {

    @Id // 指定主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 指定主键生成策略
    private Integer id;

    @Column(name = "first_name", length = 16) // 修改列的一些设置，比如列名
    private String firstName;

    @Column(length = 16)
    private String lastName;

    @Column(unique = true, nullable = false) // 添加唯一约束和非空约束
    private String email;
}

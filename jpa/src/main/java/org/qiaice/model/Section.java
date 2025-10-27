package org.qiaice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Section extends BaseModel {

    private String name;

    private String orders;

    @ManyToOne // 一对多关系的维护端
    @JoinColumn(name = "course_id") // 一对多关系不需要建立中间表，只需要再添加一个字段就行，默认添加外键
    private Course course;

    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;
}

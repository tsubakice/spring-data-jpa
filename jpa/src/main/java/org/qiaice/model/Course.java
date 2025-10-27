package org.qiaice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    @ManyToMany // 多对多关系的维护端
    @JoinTable( // 建立多对多关系的中间表
            name = "author_course",
            joinColumns = @JoinColumn(name = "course_id"), // 和 @Column 注解一样可以添加约束，默认添加外键
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private List<Author> authors;

    @OneToMany(mappedBy = "course") // 一对多关系的被维护端
    private List<Section> sections;
}

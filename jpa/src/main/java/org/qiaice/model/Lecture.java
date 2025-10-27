package org.qiaice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @OneToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;
}

package org.qiaice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "file_id")
@EqualsAndHashCode(callSuper = true)
public class File extends Resource {
    private Integer type;
}

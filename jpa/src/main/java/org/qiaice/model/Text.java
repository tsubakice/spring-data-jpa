package org.qiaice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "text_id")
@EqualsAndHashCode(callSuper = true)
public class Text extends Resource {
    private String content;
}

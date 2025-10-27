package org.qiaice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "video_id") // 配置子表主键名称
@EqualsAndHashCode(callSuper = true)
public class Video extends Resource {
    private Integer length;
}

package kxr.design.ssm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Series {
    private Integer seriesId;

    private Integer brandId;

    private String seriesName;

    private String status;
}
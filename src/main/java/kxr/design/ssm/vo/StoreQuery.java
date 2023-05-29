package kxr.design.ssm.vo;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StoreQuery {
    private Long id;

    private Integer brandId;

    private Integer seriesId;

    private String status;

    private int page = 1;

    private int limit = 5;

    private String orderBy;
}

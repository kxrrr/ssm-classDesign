package kxr.design.ssm.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SeriesTree {
    private Integer value;
    private String label;
    private List<SeriesTree> children;
}

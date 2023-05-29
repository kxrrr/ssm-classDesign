package kxr.design.ssm.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SalesChart {
    private String date;

    private BigDecimal income;

    private BigDecimal expenditure;

    private BigDecimal profit;
}

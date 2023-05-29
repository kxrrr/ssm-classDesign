package kxr.design.ssm.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;

    private Long customerId;

    private Integer employeeId;

    private BigDecimal totalPrice;

    private String status;

    private Date createTime;

    private Date payTime;

    private Date updateTime;
}
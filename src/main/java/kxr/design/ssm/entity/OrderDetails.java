package kxr.design.ssm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {
    private String id;

    private Long orderId;

    private Long carId;

    private Integer carNumber;
}
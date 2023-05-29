package kxr.design.ssm.entity;


import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Long id;

    private String name;

    private String phone;

    private String idCard;

    private Date createTime;
}
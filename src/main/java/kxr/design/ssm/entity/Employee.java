package kxr.design.ssm.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;

    private String role;

    private String name;

    private String password;

    private String idCard;

    private String phone;

    private String gender;

    private BigDecimal salary;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date entryTime;

    private String status;
}
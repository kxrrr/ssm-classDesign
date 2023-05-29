package kxr.design.ssm.mapper;

import kxr.design.ssm.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeMapperTest {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void selectByPrimaryKey() {
        Employee employee = employeeMapper.selectByPrimaryKey(1234567890);
        System.out.println(employee.toString());
    }
}
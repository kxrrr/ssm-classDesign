package kxr.design.ssm.service;

import kxr.design.ssm.common.ServerResponse;
import kxr.design.ssm.entity.Employee;
import kxr.design.ssm.vo.EmployeeQuery;

public interface IEmployeeService {
    ServerResponse addEmployee(Employee employee);

    ServerResponse updateEmployee(Employee employee);

    ServerResponse getList(EmployeeQuery employeeQuery);

    ServerResponse validPassword(Integer id, String validPass);

    ServerResponse updatePassword(Integer id, String oldPass, String newPass);
}

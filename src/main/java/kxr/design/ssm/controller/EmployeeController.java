package kxr.design.ssm.controller;

import kxr.design.ssm.common.ServerResponse;
import kxr.design.ssm.entity.Employee;
import kxr.design.ssm.service.IEmployeeService;
import kxr.design.ssm.vo.EmployeeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping(value = "addEmployee", method = RequestMethod.POST)
    public ServerResponse addEmployee(Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public ServerResponse getList(EmployeeQuery employeeQuery) {
        return employeeService.getList(employeeQuery);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ServerResponse update(Employee employee) {
        return employeeService.updateEmployee(employee);
    }
}

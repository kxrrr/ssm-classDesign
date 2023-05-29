package kxr.design.ssm.service;

import kxr.design.ssm.common.ServerResponse;
import kxr.design.ssm.entity.Employee;

public interface IUserService {

    ServerResponse<Employee> login(Integer userId, String password);
}

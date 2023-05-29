package kxr.design.ssm.service;

import kxr.design.ssm.common.ServerResponse;
import kxr.design.ssm.entity.Customer;
import kxr.design.ssm.vo.CustomerQuery;

public interface ICustomerService {
    ServerResponse addCustomer(Customer customer);

    ServerResponse getList(CustomerQuery customerQuery);

    ServerResponse updateCustomer(Customer customer);
}

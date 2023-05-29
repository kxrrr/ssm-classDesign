package kxr.design.ssm.service;

import kxr.design.ssm.common.ServerResponse;
import kxr.design.ssm.entity.OrderDetails;
import kxr.design.ssm.vo.DetailsQuery;
import kxr.design.ssm.vo.OrderQuery;
import kxr.design.ssm.vo.OrderVo;

public interface IOrderService {
    ServerResponse addOrder(OrderVo orderVo);

    ServerResponse getList(OrderQuery orderQuery);

    ServerResponse update(Long orderId, String status);

    ServerResponse updateDetail(OrderDetails orderDetails);

    ServerResponse deleteDetail(String id);

    ServerResponse getDetailsList(DetailsQuery detailsQuery);
}

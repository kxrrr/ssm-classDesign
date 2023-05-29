package kxr.design.ssm.service;

import kxr.design.ssm.common.ServerResponse;
import kxr.design.ssm.entity.Brand;
import kxr.design.ssm.vo.SeriesTree;

import java.util.List;

public interface IInitService {

    /**
     * 封装车系选择
     * @return
     */
    ServerResponse<List<SeriesTree>> seriesOpt();

    /**
     * 封装品牌选择
     * @return
     */
    ServerResponse<List<Brand>> brandOpt();

    ServerResponse storeOpt(Integer seriesId);

    ServerResponse getCustomer(String idCard);
}

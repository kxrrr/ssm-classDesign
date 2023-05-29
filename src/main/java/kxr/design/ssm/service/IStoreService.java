package kxr.design.ssm.service;

import kxr.design.ssm.common.ServerResponse;
import kxr.design.ssm.entity.Car;
import kxr.design.ssm.vo.StoreQuery;

public interface IStoreService {

    ServerResponse addBrand(String brandName);

    ServerResponse delBrand(Integer brandId);

    ServerResponse addSeries(Integer brandId, String seriesName);

    ServerResponse delSeries(Integer seriesId);

    ServerResponse addStore(Car car);

    ServerResponse getList(StoreQuery storeQuery);

    ServerResponse updateStore(Car car);
}

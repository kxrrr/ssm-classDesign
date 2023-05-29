package kxr.design.ssm.controller;

import kxr.design.ssm.common.ServerResponse;
import kxr.design.ssm.entity.Car;
import kxr.design.ssm.service.IStoreService;
import kxr.design.ssm.vo.StoreQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("store")
public class StoreController {

    @Autowired
    private IStoreService storeService;

    @RequestMapping(value = "addBrand", method = RequestMethod.GET)
    public ServerResponse addBrand(String brand) {
        return storeService.addBrand(brand);
    }

    @RequestMapping(value = "delBrand", method = RequestMethod.GET)
    public ServerResponse delBrand(Integer brandId) {
        return storeService.delBrand(brandId);
    }

    @RequestMapping(value = "addSeries", method = RequestMethod.GET)
    public ServerResponse addSeries(Integer brandId, String seriesName) {
        return storeService.addSeries(brandId, seriesName);
    }

    @RequestMapping(value = "delSeries", method = RequestMethod.GET)
    public ServerResponse delSeries(Integer seriesId) {
        return storeService.delSeries(seriesId);
    }

    @RequestMapping(value = "addStore", method = RequestMethod.POST)
    public ServerResponse addStore(Car car) {
        return storeService.addStore(car);
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public ServerResponse getList(StoreQuery storeQuery) {
        return storeService.getList(storeQuery);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ServerResponse update(Car car) {
        return storeService.updateStore(car);
    }
}

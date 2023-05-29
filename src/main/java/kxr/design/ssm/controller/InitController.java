package kxr.design.ssm.controller;

import kxr.design.ssm.common.ServerResponse;
import kxr.design.ssm.service.IInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("init")
public class InitController {

    @Autowired
    private IInitService initService;

    @RequestMapping(value = "seriesOpt", method = RequestMethod.GET)
    public ServerResponse seriesOpt() {
        return initService.seriesOpt();
    }

    @RequestMapping(value = "brandOpt", method = RequestMethod.GET)
    public ServerResponse brandOpt() {
        return initService.brandOpt();
    }

    @RequestMapping(value = "storeOpt", method = RequestMethod.GET)
    public ServerResponse storeOpt(Integer seriesId) {
        return initService.storeOpt(seriesId);
    }

    @RequestMapping(value = "getCustomer", method = RequestMethod.GET)
    public ServerResponse getCustomer(String idCard) {
        return initService.getCustomer(idCard);
    }
}

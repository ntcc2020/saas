package com.ntcc.statsweb.controller;

import com.ntcc.saascommon.model.ModelJsonResult;
import com.ntcc.statsweb.service.StatsWebService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * StatsController
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@RestController
@Slf4j
public class StatsController {
    @Autowired
    private StatsWebService statsWebService;

    @RequestMapping(value = "/register/count", method = RequestMethod.GET)
    public String getRegisterCount() {
        log.info("StatsController getRegisterCount ");

        ModelJsonResult returnValue = new ModelJsonResult();
        returnValue.setResult(statsWebService.getRegisterCount());

        return returnValue.toJson();
    }
}

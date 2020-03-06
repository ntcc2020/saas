package com.ntcc.salaryweb.controller;

import com.ntcc.saascommon.model.ModelJsonResult;
import com.ntcc.salaryweb.service.SalaryWebService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * SalaryController
 * salary rest api，提供给客户端适用
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@RestController
@Slf4j
public class SalaryController {
    @Autowired
    private SalaryWebService salaryWebService;

    /*
     *  日工资统计
     */
    @RequestMapping(value = "/countByDay", method = RequestMethod.GET)
    public String countByDay(@RequestParam(name = "companyId",required = true) Integer companyId) {
        log.info("RecordController countToday ");

        ModelJsonResult returnValue = new ModelJsonResult();
        //returnValue.setResult(recordWebService.register(phoneNum));

        return returnValue.toJson();
    }

    /*
     * 工资明细
     */
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String detail(@RequestParam(name = "companyId",required = false) Integer companyId) {
        log.info("RecordController countToday " + companyId);

        ModelJsonResult returnValue = new ModelJsonResult();

        return returnValue.toJson();
    }


    /*
     * 本月工资统计，用于日历
     */
    @RequestMapping(value = "/countByMonth", method = RequestMethod.GET)
    public String countByMonth(@RequestParam(name = "companyId",required = false) Integer companyId) {
        log.info("RecordController countToday " + companyId);

        ModelJsonResult returnValue = new ModelJsonResult();

        return returnValue.toJson();
    }
}

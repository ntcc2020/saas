package com.ntcc.recordweb.controller;

import com.ntcc.recordweb.service.RecordWebService;
import com.ntcc.saascommon.model.ModelJsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;

/**
 * RecordController
 * record rest api，提供给客户端适用
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@RestController
@Slf4j
public class RecordController {
    @Autowired
    private RecordWebService recordWebService;

    /*
     * 今日考勤统计
     */
    @RequestMapping(value = "/countToday", method = RequestMethod.GET)
    public String countToday(@RequestParam(name = "companyId",required = true) Integer companyId) {
        log.info("RecordController countToday ");

        ModelJsonResult returnValue = new ModelJsonResult();
        //returnValue.setResult(recordWebService.register(phoneNum));

        return returnValue.toJson();
    }

    /*
     * 考勤明细
     */
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String detail(@RequestParam(name = "companyId",required = false) Integer companyId) {
        log.info("RecordController countToday " + companyId);

        ModelJsonResult returnValue = new ModelJsonResult();

        return returnValue.toJson();
    }


    /*
     * 本月考勤明细，用于日历
     */
    @RequestMapping(value = "/countByMonth", method = RequestMethod.GET)
    public String countByMonth(@RequestParam(name = "companyId",required = false) Integer companyId) {
        log.info("RecordController countToday " + companyId);

        ModelJsonResult returnValue = new ModelJsonResult();

        return returnValue.toJson();
    }
}

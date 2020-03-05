package com.ntcc.recordweb.controller;

import com.ntcc.recordweb.service.RecordWebService;
import com.ntcc.saascommon.model.ModelJsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/countToday", method = RequestMethod.GET)
    public String countToday() {
        log.info("RecordController countToday ");

        ModelJsonResult returnValue = new ModelJsonResult();
        //returnValue.setResult(recordWebService.register(phoneNum));

        return returnValue.toJson();
    }
}

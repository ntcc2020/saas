package com.ntcc.taskservice.controller;

import com.ntcc.taskservice.service.CompanyService;
import com.ntcc.servicecommon.entity.Company;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * CompanyController
 * company服务 RestController
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@RestController
@Slf4j
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Company getCompanyInfoById(String id) {
        log.info("CompanyController get ", id);

        return companyService.getCompanyInfoById(Integer.parseInt(id));
    }
}

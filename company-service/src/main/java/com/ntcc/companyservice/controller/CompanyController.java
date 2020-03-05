package com.ntcc.companyservice.controller;

import com.ntcc.companyservice.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
}

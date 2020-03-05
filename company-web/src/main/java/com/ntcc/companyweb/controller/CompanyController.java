package com.ntcc.companyweb.controller;

import com.ntcc.companyweb.service.CompanyWebService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * CompanyController
 * company rest api，提供给客户端适用
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@RestController
@Slf4j
public class CompanyController {
    @Autowired
    private CompanyWebService companyWebService;
}

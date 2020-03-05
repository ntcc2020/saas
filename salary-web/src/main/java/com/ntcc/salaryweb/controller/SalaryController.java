package com.ntcc.salaryweb.controller;

import com.ntcc.salaryweb.service.SalaryWebService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
}

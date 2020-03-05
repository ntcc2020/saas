package com.ntcc.salaryservice.controller;

import com.ntcc.salaryservice.service.SalaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * SalaryController
 * salary服务 RestController
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@RestController
@Slf4j
public class SalaryController {
    @Autowired
    private SalaryService salaryService;
}

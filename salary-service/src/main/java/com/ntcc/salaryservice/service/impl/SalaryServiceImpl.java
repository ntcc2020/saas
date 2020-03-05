package com.ntcc.salaryservice.service.impl;

import com.ntcc.salaryservice.service.SalaryService;
import com.ntcc.servicecommon.dao.SalaryMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SalaryServiceImpl
 * salary服务 业务实现
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Service
@Slf4j
public class SalaryServiceImpl implements SalaryService {
    @Autowired
    private SalaryMapper salaryMapper;
}

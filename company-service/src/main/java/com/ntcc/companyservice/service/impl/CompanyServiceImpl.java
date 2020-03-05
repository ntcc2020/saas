package com.ntcc.companyservice.service.impl;

import com.ntcc.companyservice.service.CompanyService;
import com.ntcc.servicecommon.dao.CompanyMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CompanyServiceImpl
 * company服务 业务实现
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Service
@Slf4j
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;
}

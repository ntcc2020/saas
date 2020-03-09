package com.ntcc.taskservice.service;

import com.ntcc.servicecommon.entity.Company;

/**
 * CompanyService
 * company服务 业务接口
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

public interface CompanyService {
    public Company getCompanyInfoById(int id);
}

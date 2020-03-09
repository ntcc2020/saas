package com.ntcc.taskservice.service.impl;

import com.ntcc.taskservice.service.CompanyService;
//import com.ntcc.servicecommon.entity.Company;
import lombok.extern.slf4j.Slf4j;
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
    //@Autowired
    //private CompanyMapper companyMapper;

    @Override
    public int getCompanyInfoById(int id) {
        if(id > 0){
            return 0 ;//companyMapper.selectByPrimaryKey(id);
        }
        return -1;
    }
}

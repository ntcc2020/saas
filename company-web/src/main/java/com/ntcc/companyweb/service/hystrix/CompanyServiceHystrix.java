package com.ntcc.companyweb.service.hystrix;

import com.ntcc.companyweb.service.CompanyServiceRemote;
import org.springframework.stereotype.Component;

/**
 * CompanyServiceHystrix
 * company服务 熔断器
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Component
public class CompanyServiceHystrix implements CompanyServiceRemote {

	@Override
	public int getCompanyInfoById(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
}

package com.ntcc.companyweb.service;

import com.ntcc.companyweb.service.hystrix.CompanyServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * CompanyServiceRemote
 * company服务的feign客户端接口
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */
@FeignClient(value = "company-service", fallback = CompanyServiceHystrix.class)
public interface CompanyServiceRemote {
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public int getCompanyInfoById(@RequestParam(value = "id") String id);
}

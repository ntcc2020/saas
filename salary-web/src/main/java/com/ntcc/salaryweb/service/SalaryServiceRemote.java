package com.ntcc.salaryweb.service;

import com.ntcc.salaryweb.service.hystrix.SalaryServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * SalaryServiceRemote
 * salary服务的feign客户端接口
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */
@FeignClient(value = "salary-service", fallback = SalaryServiceHystrix.class)
public interface SalaryServiceRemote {
}

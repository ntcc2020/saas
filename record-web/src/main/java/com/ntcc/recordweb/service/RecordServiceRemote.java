package com.ntcc.recordweb.service;

import com.ntcc.recordweb.service.hystrix.RecordServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * RecordServiceRemote
 * record服务的feign客户端接口
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */
@FeignClient(value = "record-service", fallback = RecordServiceHystrix.class)
public interface RecordServiceRemote {
}

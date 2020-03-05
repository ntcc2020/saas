package com.ntcc.projectweb.service;

import com.ntcc.projectweb.service.hystrix.ProjectServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * ProjectServiceRemote
 * project服务的feign客户端接口
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */
@FeignClient(value = "project-service", fallback = ProjectServiceHystrix.class)
public interface ProjectServiceRemote {
}

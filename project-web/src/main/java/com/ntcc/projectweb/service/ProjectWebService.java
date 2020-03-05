package com.ntcc.projectweb.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * ProjectWebService
 * projectweb 业务实现
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Service
@Configuration
@EnableCaching
@Slf4j
public class ProjectWebService implements Serializable {
    @Autowired
    private ProjectServiceRemote projectServiceRemote;
}

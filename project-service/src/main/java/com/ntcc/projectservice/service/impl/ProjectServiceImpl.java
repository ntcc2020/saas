package com.ntcc.projectservice.service.impl;

import com.ntcc.projectservice.service.ProjectService;
import com.ntcc.servicecommon.dao.ProjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProjectServiceImpl
 * project服务 业务实现
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Service
@Slf4j
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectMapper projectMapper;
}

package com.ntcc.projectservice.controller;

import com.ntcc.projectservice.service.ProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProjectController
 * project服务 RestController
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@RestController
@Slf4j
public class ProjectController {
    @Autowired
    private ProjectService projectService;
}

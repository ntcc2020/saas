package com.ntcc.projectweb.controller;

import com.ntcc.projectweb.service.ProjectWebService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProjectController
 * project rest api，提供给客户端适用
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@RestController
@Slf4j
public class ProjectController {
    @Autowired
    private ProjectWebService projectWebService;
}

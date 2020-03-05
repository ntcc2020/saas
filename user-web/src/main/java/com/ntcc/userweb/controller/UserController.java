package com.ntcc.userweb.controller;

import com.ntcc.userweb.service.UserWebService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 * user rest api，提供给客户端适用
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserWebService userWebService;
}

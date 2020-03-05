package com.ntcc.userservice.controller;

import com.ntcc.userservice.service.UserService;
import com.ntcc.saascommon.model.user.ModelUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController
 * user服务 RestController
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public int register(String phoneNum) {
        log.info("UserController register ", phoneNum);

        return userService.register(phoneNum);
    }

    @RequestMapping(value = "/profile/list", method = RequestMethod.GET)
    public List<ModelUser> queryProfileList(int pageNum, int pageSize) {
        log.info("UserController queryProfileList ", pageNum, pageSize);

        return userService.queryProfileList(pageNum, pageSize);
    }
}

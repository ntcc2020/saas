package com.ntcc.userweb.controller;

import com.ntcc.userweb.service.UserWebService;
import com.ntcc.saascommon.model.ModelJsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(String phoneNum) {
        log.info("UserController register ", phoneNum);

        ModelJsonResult returnValue = new ModelJsonResult();
        returnValue.setResult(userWebService.register(phoneNum));

        return returnValue.toJson();
    }

    @RequestMapping(value = "/profile/list", method = RequestMethod.GET)
    public String queryProfileList(int pageNum, int pageSize) {
        log.info("UserController queryProfileList ", pageNum, pageSize);

        ModelJsonResult returnValue = new ModelJsonResult();
        returnValue.setResult(userWebService.queryProfileList(pageNum, pageSize));

        return returnValue.toJson();
    }

    @RequestMapping(value = "/profile/with/auth/log", method = RequestMethod.GET)
    public String getProfileWithAuthLog(long userId) {
        log.info("UserController getProfileWithAuthLog ", userId);

        ModelJsonResult returnValue = new ModelJsonResult();
        returnValue.setResult(userWebService.getProfileWithAuthLog(userId));

        return returnValue.toJson();
    }

    @RequestMapping(value = "/identity/auth", method = RequestMethod.GET)
    public String identityAuth(long userId, String name, int certificateType, String certificateNo) {
        log.info("UserController identityAuth ", userId, name, certificateType, certificateNo);

        ModelJsonResult returnValue = new ModelJsonResult();
        returnValue.setResult(userWebService.authIdentity(userId, name, certificateType, certificateNo));

        return returnValue.toJson();
    }

    @RequestMapping(value = "/identity/audit", method = RequestMethod.GET)
    public String auditIdentity(long userId, long userAuthlogId) {
        log.info("UserController auditIdentity ", userId, userAuthlogId);

        ModelJsonResult returnValue = new ModelJsonResult();
        returnValue.setResult(userWebService.auditIdentity(userId, userAuthlogId));

        return returnValue.toJson();
    }
}

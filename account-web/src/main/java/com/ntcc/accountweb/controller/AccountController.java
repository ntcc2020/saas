package com.ntcc.accountweb.controller;

import com.ntcc.accountweb.service.AccountWebService;
import com.ntcc.saascommon.model.ModelJsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * AccountController
 * account rest api，提供给客户端适用
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@RestController
@Slf4j
public class AccountController {
    @Autowired
    private AccountWebService accountWebService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(String phoneNum) {
        log.info("AccountController register ", phoneNum);

        ModelJsonResult returnValue = new ModelJsonResult();
        returnValue.setResult(accountWebService.register(phoneNum));

        return returnValue.toJson();
    }

    @RequestMapping(value = "/profile/list", method = RequestMethod.GET)
    public String queryProfileList(int pageNum, int pageSize) {
        log.info("AccountController queryProfileList ", pageNum, pageSize);

        ModelJsonResult returnValue = new ModelJsonResult();
        returnValue.setResult(accountWebService.queryProfileList(pageNum, pageSize));

        return returnValue.toJson();
    }

    @RequestMapping(value = "/profile/with/auth/log", method = RequestMethod.GET)
    public String getProfileWithAuthLog(long userId) {
        log.info("AccountController getProfileWithAuthLog ", userId);

        ModelJsonResult returnValue = new ModelJsonResult();
        returnValue.setResult(accountWebService.getProfileWithAuthLog(userId));

        return returnValue.toJson();
    }

    @RequestMapping(value = "/identity/auth", method = RequestMethod.GET)
    public String identityAuth(long userId, String name, int certificateType, String certificateNo) {
        log.info("AccountController identityAuth ", userId, name, certificateType, certificateNo);

        ModelJsonResult returnValue = new ModelJsonResult();
        returnValue.setResult(accountWebService.authIdentity(userId, name, certificateType, certificateNo));

        return returnValue.toJson();
    }

    @RequestMapping(value = "/identity/audit", method = RequestMethod.GET)
    public String auditIdentity(long userId, long accountAuthlogId) {
        log.info("AccountController auditIdentity ", userId, accountAuthlogId);

        ModelJsonResult returnValue = new ModelJsonResult();
        returnValue.setResult(accountWebService.auditIdentity(userId, accountAuthlogId));

        return returnValue.toJson();
    }
}

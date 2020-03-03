package com.ntcc.accountservice.controller;

import com.ntcc.accountservice.service.AccountService;
import com.ntcc.saascommon.model.account.ModelAuthLog;
import com.ntcc.saascommon.model.account.ModelProfile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * AccountController
 * account服务 RestController
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@RestController
@Slf4j
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public int register(String phoneNum) {
        log.info("AccountController register ", phoneNum);

        return accountService.register(phoneNum);
    }

    @RequestMapping(value = "/profile/list", method = RequestMethod.GET)
    public List<ModelProfile> queryProfileList(int pageNum, int pageSize) {
        log.info("AccountController queryProfileList ", pageNum, pageSize);

        return accountService.queryProfileList(pageNum, pageSize);
    }

    @RequestMapping(value = "/profile/with/auth/log", method = RequestMethod.GET)
    public ModelProfile getProfileWithAuthLog(long userId) {
        log.info("AccountController getProfileWithAuthLog ", userId);

        return accountService.selectByPrimaryKeyWithAuthLog(userId);
    }

    @RequestMapping(value = "/identity/auth", method = RequestMethod.GET)
    public int authIdentity(long userId, String name, int certificateType, String certificateNo) {
        log.info("AccountController authIdentity ", userId, name, certificateType, certificateNo);

        ModelAuthLog modelAuthLog = new ModelAuthLog();
        modelAuthLog.setUserId(userId);
        modelAuthLog.setName(name);
        modelAuthLog.setCertificateType(certificateType);
        modelAuthLog.setCertificateNo(certificateNo);

        return accountService.authIdentity(modelAuthLog);
    }

    @RequestMapping(value = "/identity/audit", method = RequestMethod.GET)
    public int auditIdentity(long userId, long accountAuthLogId) {
        log.info("AccountController auditIdentity ", userId, accountAuthLogId);

        return accountService.auditIdentity(userId, accountAuthLogId);
    }
}

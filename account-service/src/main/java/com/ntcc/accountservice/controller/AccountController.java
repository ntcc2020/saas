package com.ntcc.accountservice.controller;

import com.ntcc.accountservice.service.AccountService;
import com.ntcc.saascommon.model.account.ModelUser;
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
    public List<ModelUser> queryProfileList(int pageNum, int pageSize) {
        log.info("AccountController queryProfileList ", pageNum, pageSize);

        return accountService.queryProfileList(pageNum, pageSize);
    }
}

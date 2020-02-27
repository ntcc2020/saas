package com.ntcc.accountweb.service;

import com.ntcc.accountweb.service.hystrix.AccountServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="accountservice", fallback = AccountServiceHystrix.class)
public interface AccountWeb {
    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register(@RequestParam(value = "message") String message);

    @RequestMapping(value = "queryUser", method = RequestMethod.GET)
    public String queryUser(@RequestParam(value = "pageNum") int pageNum, @RequestParam(value = "pageSize") int pageSize);
}

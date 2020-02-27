package com.ntcc.accountweb.service.hystrix;

import com.ntcc.accountweb.service.AccountWeb;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class AccountServiceHystrix implements AccountWeb {
    @Override
    public String register(String message){
        return String.format("Register error", message);
    }

    @Override
    public String queryUser(@RequestParam(value = "pageNum") int pageNum, @RequestParam(value = "pageSize") int pageSize){
        return String.format("QueryUser error", pageNum, pageSize);
    }
}

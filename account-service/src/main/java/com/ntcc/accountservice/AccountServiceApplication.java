package com.ntcc.accountservice;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ntcc.accountservice.dao.AccountAuthMapper;
import com.ntcc.accountservice.dao.AccountProfileMapper;
import com.ntcc.accountservice.entity.AccountAuth;
import com.ntcc.accountservice.entity.AccountProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }

    @Value("${server.port}")
    private String port;

    @Autowired
    private AccountAuthMapper accountAuthMapper;
    private AccountProfileMapper accountProfileMapper;

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public int register(String phoneNum){
        AccountProfile accountProfile = new AccountProfile();
        int userNo =  accountProfileMapper.insert(accountProfile);

        AccountAuth accountAuth = new AccountAuth();
        accountAuth.setUserno(userNo);
        accountAuth.setAuthvalue(phoneNum);
        return accountAuthMapper.insert(accountAuth);
    }

    public List<AccountProfile> queryAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Example example = new Example(AccountProfile.class);
        PageInfo<AccountProfile> pageInfo = new PageInfo<AccountProfile>(accountProfileMapper.selectByExample(example));
        return pageInfo.getList();
    }

}

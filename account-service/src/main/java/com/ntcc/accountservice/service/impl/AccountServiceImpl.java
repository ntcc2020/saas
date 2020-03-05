package com.ntcc.accountservice.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ntcc.accountservice.component.AccountQueueSender;
import com.ntcc.accountservice.service.AccountService;
import com.ntcc.saascommon.model.account.ModelUser;
import com.ntcc.servicecommon.dao.UserMapper;
import com.ntcc.servicecommon.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * AccountServiceImpl
 * account服务 业务实现
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AccountQueueSender accountQueueSender;

    public int register(String phoneNum) {
        log.info("AccountServiceImpl register ", phoneNum);

        User user = new User();
        user.setMobile(phoneNum);
        int ret = userMapper.insert(user);

        accountQueueSender.send("register");

        return ret;
    }

    public List<ModelUser> queryProfileList(int pageNum, int pageSize) {
        log.info("AccountServiceImpl queryProfileList ", pageNum, pageSize);

        PageHelper.startPage(pageNum, pageSize);
        Example example = new Example(User.class);
        PageInfo<User> pageInfo = new PageInfo<User>(userMapper.selectByExample(example));
        return profilesTransfer(pageInfo.getList());
    }

    protected List<ModelUser> profilesTransfer(List<User> rows) {
        List<ModelUser> returnValue = new ArrayList<>();

        for (User row : rows) {
            returnValue.add(profileTransfer(row));
        }

        return returnValue;
    }

    protected ModelUser profileTransfer(User user) {
        ModelUser returnValue = new ModelUser();

        returnValue.setId(user.getId());
        returnValue.setMobile(user.getMobile());

        return returnValue;
    }
}

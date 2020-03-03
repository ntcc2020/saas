package com.ntcc.accountservice.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ntcc.accountservice.component.AccountQueueSender;
import com.ntcc.accountservice.dao.AccountAuthLogMapper;
import com.ntcc.accountservice.dao.AccountProfileMapper;
import com.ntcc.accountservice.entity.AccountAuthLog;
import com.ntcc.accountservice.entity.AccountProfile;
import com.ntcc.accountservice.service.AccountService;
import com.ntcc.saascommon.model.account.ModelAuthLog;
import com.ntcc.saascommon.model.account.ModelProfile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
    private AccountProfileMapper accountProfileMapper;

    @Autowired
    private AccountAuthLogMapper accountAuthLogMapper;

    @Autowired
    private AccountQueueSender accountQueueSender;

    public int register(String phoneNum) {
        log.info("AccountServiceImpl register ", phoneNum);

        AccountProfile accountProfile = new AccountProfile();
        accountProfile.setPhoneNumber(phoneNum);
        int ret = accountProfileMapper.insert(accountProfile);

        accountQueueSender.send("register");

        return ret;
    }

    public List<ModelProfile> queryProfileList(int pageNum, int pageSize) {
        log.info("AccountServiceImpl queryProfileList ", pageNum, pageSize);

        PageHelper.startPage(pageNum, pageSize);
        Example example = new Example(AccountProfile.class);
        PageInfo<AccountProfile> pageInfo = new PageInfo<AccountProfile>(accountProfileMapper.selectByExample(example));
        return profilesTransfer(pageInfo.getList());
    }

    public ModelProfile selectByPrimaryKeyWithAuthLog(long userId) {
        log.info("AccountServiceImpl selectByPrimaryKeyWithAuthLog ", userId);

        return profileTransfer(accountProfileMapper.selectByPrimaryKeyWithAuthLog(userId));
    }

    public int authIdentity(ModelAuthLog modelAuthLog) {
        log.info("AccountServiceImpl authIdentity ", modelAuthLog.getUserId(), modelAuthLog.getName(),
                modelAuthLog.getCertificateType(), modelAuthLog.getCertificateNo());

        AccountAuthLog accountAuthLog = new AccountAuthLog();
        accountAuthLog.setUserId(modelAuthLog.getUserId());
        accountAuthLog.setName(modelAuthLog.getName());
        accountAuthLog.setCertificateType(modelAuthLog.getCertificateType());
        accountAuthLog.setCertificateNo(modelAuthLog.getCertificateNo());

        return accountAuthLogMapper.insert(accountAuthLog);
    }

    @Transactional(rollbackFor = Exception.class)
    public int auditIdentity(long userId, long accountAuthLogId) {
        log.info("AccountServiceImpl auditIdentity ", userId, accountAuthLogId);

        AccountProfile accountProfile = accountProfileMapper.selectByPrimaryKey(userId);
        accountProfile.setStatus(1);
        AccountAuthLog accountAuthLog = accountAuthLogMapper.selectByPrimaryKey(accountAuthLogId);
        accountAuthLog.setStatus(1);

        accountProfileMapper.updateByPrimaryKey(accountProfile);

        return accountAuthLogMapper.updateByPrimaryKey(accountAuthLog);
    }

    protected List<ModelProfile> profilesTransfer(List<AccountProfile> rows) {
        List<ModelProfile> returnValue = new ArrayList<>();

        for (AccountProfile row : rows) {
            returnValue.add(profileTransfer(row));
        }

        return returnValue;
    }

    protected ModelProfile profileTransfer(AccountProfile accountProfile) {
        ModelProfile modelProfile = new ModelProfile();

        modelProfile.setId(accountProfile.getId());
        modelProfile.setPhoneNumber(accountProfile.getPhoneNumber());

        return modelProfile;
    }
}

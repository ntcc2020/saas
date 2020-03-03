package com.ntcc.accountservice.service;

import com.ntcc.saascommon.model.account.ModelAuthLog;
import com.ntcc.saascommon.model.account.ModelProfile;

import java.util.List;

/**
 * AccountService
 * account服务 业务接口
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

public interface AccountService {
    public int register(String phoneNum);

    public List<ModelProfile> queryProfileList(int pageNum, int pageSize);

    public ModelProfile selectByPrimaryKeyWithAuthLog(long userId);

    public int authIdentity(ModelAuthLog modelAuthLog);

    public int auditIdentity(long userId, long accountAuthLogId);
}

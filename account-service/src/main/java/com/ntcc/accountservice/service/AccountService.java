package com.ntcc.accountservice.service;

import com.ntcc.saascommon.model.account.ModelUser;

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

    public List<ModelUser> queryProfileList(int pageNum, int pageSize);
}

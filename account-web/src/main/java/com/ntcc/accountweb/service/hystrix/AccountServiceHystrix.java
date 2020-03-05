package com.ntcc.accountweb.service.hystrix;

import com.ntcc.accountweb.service.AccountServiceRemote;
import com.ntcc.saascommon.model.account.ModelUser;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * AccountServiceHystrix
 * account服务 熔断器
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Component
public class AccountServiceHystrix implements AccountServiceRemote {
    @Override
    public int register(String phoneNum) {
        return 0;
    }

    @Override
    public List<ModelUser> queryProfileList(int pageNum, int pageSize) {
        return new ArrayList<>();
    }

    @Override
    public ModelUser getProfileWithAuthLog(long userId) {
        return new ModelUser();
    }

    @Override
    public int authIdentity(long userId, String name, int certificateType, String certificateNo) {
        return 0;
    }

    @Override
    public int auditIdentity(long userId, long accountAuthLogId) {
        return 0;
    }
}

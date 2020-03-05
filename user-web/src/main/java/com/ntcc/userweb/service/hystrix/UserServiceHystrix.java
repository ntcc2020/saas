package com.ntcc.userweb.service.hystrix;

import com.ntcc.saascommon.model.user.ModelUser;
import com.ntcc.userweb.service.UserServiceRemote;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * UserServiceHystrix
 * user服务 熔断器
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Component
public class UserServiceHystrix implements UserServiceRemote {
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
    public int auditIdentity(long userId, long userAuthLogId) {
        return 0;
    }
}

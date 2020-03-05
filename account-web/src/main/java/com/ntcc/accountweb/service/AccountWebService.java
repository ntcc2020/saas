package com.ntcc.accountweb.service;

import com.ntcc.accountweb.model.ProfileSession;
import com.ntcc.saascommon.model.account.ModelUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * AccountWebService
 * accountweb 业务实现
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Service
@Configuration
@EnableCaching
@Slf4j
public class AccountWebService implements Serializable {
    private static final long SESSION_CACHE_EXPIRE_SECONDS = 60 * 60 * 2;

    @Autowired
    private AccountServiceRemote accountServiceRemote;

    @Resource
    protected RedisTemplate redisTemplate;

    //
    public int register(String phoneNum) {
        log.info("AccountWebService register ", phoneNum);

        int ret = accountServiceRemote.register(phoneNum);
        String token = String.valueOf(System.currentTimeMillis());
        ProfileSession profileSession = new ProfileSession();
        profileSession.setToken(token);

        redisTemplate.opsForValue().set("session:profile:by:token:" + token, profileSession,
                SESSION_CACHE_EXPIRE_SECONDS, TimeUnit.SECONDS);

        return ret;
    }

    //
    public List<ModelUser> queryProfileList(int pageNum, int pageSize) {
        log.info("AccountWebService queryProfileList ", pageNum, pageSize);

        return accountServiceRemote.queryProfileList(pageNum, pageSize);
    }

    public ModelUser getProfileWithAuthLog(@RequestParam(value = "userId") long userId) {
        log.info("AccountWebService getProfileWithAuthLog ", userId);

        return accountServiceRemote.getProfileWithAuthLog(userId);
    }

    public int authIdentity(long userId, String name, int certificateType, String certificateNo) {
        log.info("AccountWebService authIdentity ", userId, name, certificateType, certificateNo);

        return accountServiceRemote.authIdentity(userId, name, certificateType, certificateNo);
    }

    public int auditIdentity(long userId, long accountAuthLogId) {
        log.info("AccountWebService auditIdentity ", userId, accountAuthLogId);

        return accountServiceRemote.auditIdentity(userId, accountAuthLogId);
    }
}

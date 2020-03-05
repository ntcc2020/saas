package com.ntcc.userweb.service;

import com.ntcc.saascommon.model.user.ModelUser;
import com.ntcc.userweb.model.ProfileSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * UserWebService
 * userweb 业务实现
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Service
@Configuration
@EnableCaching
@Slf4j
public class UserWebService implements Serializable {
    private static final long SESSION_CACHE_EXPIRE_SECONDS = 60 * 60 * 2;

    @Autowired
    private UserServiceRemote userServiceRemote;

    @Resource
    protected RedisTemplate redisTemplate;

    //
    public int register(String phoneNum) {
        log.info("UserWebService register ", phoneNum);

        int ret = userServiceRemote.register(phoneNum);
        String token = String.valueOf(System.currentTimeMillis());
        ProfileSession profileSession = new ProfileSession();
        profileSession.setToken(token);

        redisTemplate.opsForValue().set("session:profile:by:token:" + token, profileSession,
                SESSION_CACHE_EXPIRE_SECONDS, TimeUnit.SECONDS);

        return ret;
    }

    //
    public List<ModelUser> queryProfileList(int pageNum, int pageSize) {
        log.info("UserWebService queryProfileList ", pageNum, pageSize);

        return userServiceRemote.queryProfileList(pageNum, pageSize);
    }
}

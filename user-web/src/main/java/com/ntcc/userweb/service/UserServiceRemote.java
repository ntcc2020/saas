package com.ntcc.userweb.service;

import com.ntcc.saascommon.model.user.ModelUser;
import com.ntcc.userweb.service.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * UserServiceRemote
 * user服务的feign客户端接口
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */
@FeignClient(value = "user-service", fallback = UserServiceHystrix.class)
public interface UserServiceRemote {
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public int register(@RequestParam(value = "phoneNum") String phoneNum);

    @RequestMapping(value = "/profile/list", method = RequestMethod.GET)
    public List<ModelUser> queryProfileList(@RequestParam(value = "pageNum") int pageNum,
                                            @RequestParam(value = "pageSize") int pageSize);

    @RequestMapping(value = "/profile/with/auth/log", method = RequestMethod.GET)
    public ModelUser getProfileWithAuthLog(@RequestParam(value = "userId") long userId);

    @RequestMapping(value = "/identity/auth", method = RequestMethod.GET)
    public int authIdentity(@RequestParam(value = "userId") long userId, @RequestParam(value = "name") String name,
                            @RequestParam(value = "certificateType") int certificateType,
                            @RequestParam(value = "certificateNo") String certificateNo);

    @RequestMapping(value = "/identity/audit", method = RequestMethod.GET)
    public int auditIdentity(@RequestParam(value = "userId") long userId,
                             @RequestParam(value = "userAuthLogId") long userAuthLogId);
}

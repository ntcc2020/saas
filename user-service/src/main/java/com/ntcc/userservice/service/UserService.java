package com.ntcc.userservice.service;

import com.ntcc.saascommon.model.user.ModelUser;

import java.util.List;

/**
 * UserService
 * user服务 业务接口
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

public interface UserService {
    public int register(String phoneNum);

    public List<ModelUser> queryProfileList(int pageNum, int pageSize);
}

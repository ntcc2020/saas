package com.ntcc.accountservice.dao;

import com.ntcc.accountservice.entity.AccountProfile;
import tk.mybatis.MyMapper;

public interface AccountProfileMapper extends MyMapper<AccountProfile> {
    AccountProfile selectByPrimaryKeyWithAuthLog(Long id);
}
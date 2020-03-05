package com.ntcc.userweb.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * ProfileSession
 * 用户登录session对象
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */
@EqualsAndHashCode()
@Data
public class ProfileSession implements Serializable {
    //
    private String token;
    private Date expireDate;
}

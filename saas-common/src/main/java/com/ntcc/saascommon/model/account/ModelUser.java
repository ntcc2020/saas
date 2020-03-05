package com.ntcc.saascommon.model.account;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * ModelUser
 * 用户 model类
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@EqualsAndHashCode()
@Data
public class ModelUser implements Serializable {
    private Long id;

    private String mobile;
}
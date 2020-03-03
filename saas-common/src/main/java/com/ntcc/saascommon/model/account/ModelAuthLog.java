package com.ntcc.saascommon.model.account;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * ModelAuthLog
 * 身份认证日志 model类
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@EqualsAndHashCode()
@Data
public class ModelAuthLog implements Serializable {
    private Long id;

    private Long userId;

    private String name;

    private Integer certificateType;

    private String certificateNo;

    private Integer status;
}
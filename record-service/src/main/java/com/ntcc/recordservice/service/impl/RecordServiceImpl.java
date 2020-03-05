package com.ntcc.recordservice.service.impl;

import com.ntcc.recordservice.service.RecordService;
import com.ntcc.servicecommon.dao.UserRecordMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * RecordServiceImpl
 * record服务 业务实现
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Service
@Slf4j
public class RecordServiceImpl implements RecordService {
    @Autowired
    private UserRecordMapper userRecordMapper;
}

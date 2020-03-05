package com.ntcc.recordservice.controller;

import com.ntcc.recordservice.service.RecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * RecordController
 * record服务 RestController
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@RestController
@Slf4j
public class RecordController {
    @Autowired
    private RecordService recordService;
}

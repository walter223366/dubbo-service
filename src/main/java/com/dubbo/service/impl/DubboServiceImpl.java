package com.dubbo.service.impl;

import com.dubbo.inter.DubboService;

public class DubboServiceImpl implements DubboService {
    @Override
    public String getMessage() {
        return "Test Dubbo success!";
    }
}

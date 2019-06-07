package com.bawei.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bawei.ServiceAPI;
import org.springframework.stereotype.Component;

@Service(interfaceClass = ServiceAPI.class)
@Component
public class ServiceAPIImpl implements ServiceAPI {
    @Override
    public String sendMessage(String message) {
        return "qucik-start-provider-message"+message;
    }
}

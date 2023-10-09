package com.example.demo.controller;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.core.FlowExecutorHolder;
import com.yomahub.liteflow.flow.LiteflowResponse;
import com.yomahub.liteflow.property.LiteflowConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.security.Principal;

@RestController
public class SecurityController {
    @Resource
    private FlowExecutor flowExecutor;

    @RequestMapping(value = "/username", method = RequestMethod.GET)
    public String currentUserName() {
        //初始化流程入参
//        LiteflowConfig config = new LiteflowConfig();
//        config.setRuleSource("liteflow.xml");
//        FlowExecutor flowExecutor = FlowExecutorHolder.loadInstance(config);
//        flowExecutor.execute2Resp("a", "");
        LiteflowResponse liteflowResponse = flowExecutor.execute2Resp("chain1", "");


        return "12322282";
//        return principal.getName();
    }

    @RequestMapping(value = "/password", method = RequestMethod.GET)
    public String password() {
        return "password";
//        return principal.getName();
    }
}

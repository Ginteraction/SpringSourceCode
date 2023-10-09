package com.example.demo.liteflow;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.aop.TargetSource;


@LiteflowComponent("a")
public class ANode extends NodeComponent {


    @Override
    public void process() throws Exception {
        System.out.println("执行逻辑开始");
    }
}

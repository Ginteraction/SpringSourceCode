package com.example.demo.liteflow;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;


@LiteflowComponent("c")
public class CNode extends NodeComponent {


    @Override
    public void process() throws Exception {
        System.out.println("执行逻辑开始");
    }
}

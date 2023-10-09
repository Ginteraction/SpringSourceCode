package com.example.demo.liteflow;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;


@LiteflowComponent("b")
public class BNode extends NodeComponent {


    @Override
    public void process() throws Exception {
        System.out.println("执行逻辑开始");
    }
}

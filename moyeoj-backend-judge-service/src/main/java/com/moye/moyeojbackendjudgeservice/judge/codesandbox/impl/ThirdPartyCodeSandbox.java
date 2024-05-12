package com.moye.moyeojbackendjudgeservice.judge.codesandbox.impl;

import com.moye.moyeojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.moye.moyeojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.moye.moyeojbackendmodel.model.codesandbox.ExecuteCodeResponse;

public class ThirdPartyCodeSandbox implements CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}

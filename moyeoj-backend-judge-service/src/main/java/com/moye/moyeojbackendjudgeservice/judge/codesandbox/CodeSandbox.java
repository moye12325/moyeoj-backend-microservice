package com.moye.moyeojbackendjudgeservice.judge.codesandbox;

import com.moye.moyeojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.moye.moyeojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}

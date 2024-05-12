package com.moye.moyeojbackendjudgeservice.judge.codesandbox.impl;

import com.moye.moyeojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.moye.moyeojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.moye.moyeojbackendmodel.model.codesandbox.ExecuteCodeResponse;
import com.moye.moyeojbackendmodel.model.codesandbox.JudgeInfo;
import com.moye.moyeojbackendmodel.model.enums.QuestionSubmitStatusEnum;
import com.moye.moyeojbackendmodel.model.enums.JudgeInfoEnum;

import java.util.List;

/**
 * 实例代码沙箱
 */
public class ExampleCodeSandbox implements CodeSandbox {
    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("示例代码沙箱");
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}

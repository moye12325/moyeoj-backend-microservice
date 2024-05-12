package com.moye.moyeojbackendjudgeservice.judge.codesandbox;

import com.moye.moyeojbackendjudgeservice.judge.codesandbox.impl.ExampleCodeSandbox;
import com.moye.moyeojbackendjudgeservice.judge.codesandbox.impl.RemoteCodeSandbox;
import com.moye.moyeojbackendjudgeservice.judge.codesandbox.impl.ThirdPartyCodeSandbox;


/**
 * 代码沙箱创建工厂
 */
public class CodeSandboxFactory {
    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }
}

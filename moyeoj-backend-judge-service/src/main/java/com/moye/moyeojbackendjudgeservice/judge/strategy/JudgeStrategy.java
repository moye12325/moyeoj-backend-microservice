package com.moye.moyeojbackendjudgeservice.judge.strategy;

import com.moye.moyeojbackendmodel.model.codesandbox.JudgeInfo;


/**
 * 判题策略
 */
public interface JudgeStrategy {
    JudgeInfo doJudge(JudgeContext judgeContext);
}

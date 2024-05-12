package com.moye.moyeojbackendjudgeservice.judge;

import com.moye.moyeojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.moye.moyeojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.moye.moyeojbackendjudgeservice.judge.strategy.JudgeContext;
import com.moye.moyeojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.moye.moyeojbackendmodel.model.codesandbox.JudgeInfo;
import com.moye.moyeojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理 简化调用
 */
@Service
public class JudgeManager {

    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if (language.equals("java")) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}

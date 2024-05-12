package com.moye.moyeojbackendjudgeservice.judge.strategy;

import com.moye.moyeojbackendmodel.model.codesandbox.JudgeInfo;
import com.moye.moyeojbackendmodel.model.dto.question.JudgeCase;
import com.moye.moyeojbackendmodel.model.entity.Question;
import com.moye.moyeojbackendmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文 用于定义传递的参数
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private Question question;

    private List<JudgeCase> judgeCaseList;

    private QuestionSubmit questionSubmit;
}

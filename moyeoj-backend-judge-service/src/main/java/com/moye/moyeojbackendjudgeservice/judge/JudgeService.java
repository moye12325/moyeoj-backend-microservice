package com.moye.moyeojbackendjudgeservice.judge;

import com.moye.moyeojbackendmodel.model.entity.QuestionSubmit;

public interface JudgeService {

    QuestionSubmit doJudge(long submitId);
}

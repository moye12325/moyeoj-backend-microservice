package com.moye.moyeojbackendserviceclient.service;


import com.moye.moyeojbackendmodel.model.entity.QuestionSubmit;

public interface JudgeService {

    QuestionSubmit doJudge(long submitId);
}

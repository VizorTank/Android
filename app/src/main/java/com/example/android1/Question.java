package com.example.android1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Question {
    @Getter int questionId;
    @Getter boolean trueAnswer;
    public Question(int questionId, boolean trueAnswer) {
        this.questionId = questionId;
        this.trueAnswer = trueAnswer;
    }
}

package com.easyarch.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
    private int AnswerID;//答案号
    private String context;
    private int score;
    private boolean isChoose =  false;
}

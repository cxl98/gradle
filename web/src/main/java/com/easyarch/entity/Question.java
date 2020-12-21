package com.easyarch.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @ApiModelProperty(value = "题号",name = "qid",example = "1")
    private int qid;
    @ApiModelProperty(value = "题目",name = "title",example = "xxxxxx")
    private String title;
    @ApiModelProperty(value = "答案",name = "answers",example = "A,B,C,D")
    private List<Answer> answers;
    private boolean isFinished = false;

}

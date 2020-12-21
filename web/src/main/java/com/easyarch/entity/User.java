package com.easyarch.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@ApiModel(value = "用户信息",description = "用户信息")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {
    private static final long serialVersionUID = 7356552328285535299L;

//    @ApiModelProperty(value = "用户ID",name ="id",example = "123")
    private String id;
    @ApiModelProperty(value = "学号",name = "username",example = "0301180000")
    private String username;
    @ApiModelProperty(value = "密码",name = "password",example = "123456")
    private String password;
    @ApiModelProperty(value = "年龄",name = "age",example = "22")
    private int age;
    @ApiModelProperty(value = "手机号",name ="phone",example = "13600000000")
    private String phone;
    @ApiModelProperty(value = "专业",name = "major",example = "计算机科学与技术")
    private String major;

    @ApiModelProperty(value = "班级",name = "sClass",example = "1701")
    private String zClass;
    @ApiModelProperty(value = "性别",name = "gender",example = "男")
    private int gender;
}

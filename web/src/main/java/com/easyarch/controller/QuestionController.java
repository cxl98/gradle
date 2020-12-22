package com.easyarch.controller;

import com.easyarch.entity.Answer;
import com.easyarch.entity.Question;
import com.easyarch.entity.User;
import com.easyarch.service.QuestionService;
import com.easyarch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/stu/Questions")
public class QuestionController {
    @Autowired
    private UserService userService;

    @Autowired
    private QuestionService questionService;
    private static List<Answer> answer;
    @Autowired
    private JavaMailSender javaMailSender;


    @RequestMapping("show")
    public List<Question> showQuestions(int curr, int pageSize) {
        return questionService.showQuestion(curr, pageSize);
    }

    @RequestMapping(value = "isFinished", method = RequestMethod.POST)
    public String isFinished(String id) {
        System.out.println("id " + id);
        if (null != userService.isFinished(id)) {
            return "no";
        }
        return "ok";
    }

    @RequestMapping("sendAnswers")
    public String answers(@RequestBody List<Answer> answers) {
        System.out.println("xxxxxxxx");
        if (answers != null) {
            answer = answers;
        }
        return "";
    }

    @RequestMapping("getResult")
    public String result(String id) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("1799359457@qq.com");
        mailMessage.               setTo("3179087516@qq.com");
        User finished = userService.isFinished(id);
        mailMessage.setSubject(finished.getUsername());
        int scores = 0;
        String x;
        for (Answer answer : answer) {
            scores += answer.getScore();
        }
        List<String> list = new ArrayList<>();
        list.add(0, "你的人际交往能力很强，具有合群、同情、爱心、助人的精神");
        list.add(1, "你的人际交往能力较强");
        list.add(2, "你的人际关系有待改善，需要向具有合群、同情、爱心、助人的精神方面努力");
        list.add(3, "你的人际交往能力较差，加强学习，多交朋友，多向别人请教人际交往的知识。");
        if (48 <= scores) {
            x = list.get(0);
        } else if (37 <= scores) {
            x = list.get(1);
        } else if (27 <= scores) {
            x = list.get(2);
        } else {
            x = list.get(3);
        }
        mailMessage.setText(x);
        javaMailSender.send(mailMessage);
        return x;
    }

}

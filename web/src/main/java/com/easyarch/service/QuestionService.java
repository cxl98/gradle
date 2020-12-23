package com.easyarch.service;

import com.easyarch.entity.Question;
import com.easyarch.mongo.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> showQuestion(int curr,int pageSize){
        int firstIndex = (curr - 1) * pageSize;
        int lastIndex = curr * pageSize;
        return questionRepository.findAll().subList(firstIndex,lastIndex);
    }

}

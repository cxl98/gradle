package com.easyarch;

import com.easyarch.entity.Question;
import com.easyarch.util.LoadTxt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class TestLOAD {
    @Test
    public void test(){
        List<Question> questions = LoadTxt.ReadQuestions("Research_2");
        System.out.println(questions);

    }
}

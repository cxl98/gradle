package com.easyarch;

import com.easyarch.dao.AdminDao;
import com.easyarch.dao.UserDao;
import com.easyarch.entity.Admin;
import com.easyarch.entity.User;
import com.easyarch.mongo.QuestionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.DigestUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class TestMongoDB {
    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private UserDao userDao;

//    @Before
//    public void beforeTest(){questionRepository.deleteAll();}
    @Test
    public void save(){
        //arrayList 是线程不安全的，有三种解决办法,
        //1.使用Vertor集合
        //2.使用Collections.synchronizedList。它会自动将我们的list方法进行改变，最后返回给我们一个加锁了List
        //3.就是以下这个方案
//        List<Answer> answers=new ArrayList<>();
//        Answer answer=new Answer();
//        answer.setAid("强烈肯定");
//        answer.setScore(1);
//        Answer answer1=new Answer();
//        answer1.setAid("有时");
//        answer1.setScore(2);
//        Answer answer2=new Answer();
//        answer2.setAid("绝对否定");
//        answer2.setScore(3);
//        answers.add(answer);
//        answers.add(answer1);
//        answers.add(answer2);
//        System.out.println(answers);
//        List<Question> all = questionRepository.findAll();

//        System.out.println(all);
//        Admin admin=new Admin();
//        admin.setUsername("admin");
//        admin.setPassword(DigestUtils.md5DigestAsHex("admin".getBytes()));
//        adminDao.insertAdmin(admin);
//        Admin admin1 = adminDao.findAdminByUsernameAndPassword("admin", DigestUtils.md5DigestAsHex("admin".getBytes()));
//        System.out.println(admin1);
        User user=new User();
        user.setUsername("0301180101");
        user.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));
        user.setAge(20);
        user.setMajor("计算机科学与技术");
        user.setGender(0);
        user.setZClass("1701");
        user.setPhone("13600000000");
        userDao.insertUser(user);

    }

}

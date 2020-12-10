package com.easyarch.mongo;

import com.easyarch.entity.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


public interface QuestionRepository extends MongoRepository<Question,String> {
}

package com.quizApp.quizApp.controller;

import com.quizApp.quizApp.entity.Question;
import com.quizApp.quizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Question")
public class QuestionController {

    @Autowired
    QuestionService qserv;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> allQuestions(){
        return qserv.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
        return qserv.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
       return qserv.addQuestion(question);

    }
}

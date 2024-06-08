package com.quizApp.quizApp.controller;

import com.quizApp.quizApp.service.QuizService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizServ;
    //@PostMapping("create?category={Category}&numQ={numQ}&title={title}")
    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title ){
//        return new ResponseEntity<>("Good", HttpStatus.OK);
        return quizServ.createQuiz(category,numQ,title);
    }
}


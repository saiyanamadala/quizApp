package com.quizApp.quizApp.service;

import com.quizApp.quizApp.Dao.QuestionDao;
import com.quizApp.quizApp.Dao.QuizDao;
import com.quizApp.quizApp.entity.Question;
import com.quizApp.quizApp.entity.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;

    @Autowired
    QuestionDao qDao;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> questions=qDao.findRandomQuestionsByCategory(category,numQ);
        Quiz quiz=new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);
        return new ResponseEntity<>("Quiz Created", HttpStatus.CREATED);
    }
}

package com.quizApp.quizApp.Dao;

import com.quizApp.quizApp.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}

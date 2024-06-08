package com.quizApp.quizApp.Dao;

import com.quizApp.quizApp.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {
   List<Question> findByCategory(String category);

   @Query(value = "SELECT * FROM question q Where q.category= :category ORDER BY RANDOM() LIMIT :numQ",nativeQuery = true)
//@Query(value = "SELECT * FROM question q Where q.category=?1 ORDER BY RANDOM() LIMIT ?2",nativeQuery = true) //this is also same implementation of above
    List<Question> findRandomQuestionsByCategory(String category, int numQ);
}

package com.sidenow.freshgreenish.domain.question.repository;

import com.sidenow.freshgreenish.domain.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long>, CustomQuestionRepository {
}

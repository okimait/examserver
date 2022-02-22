package com.examiner.examserver.repo;

import com.examiner.examserver.model.exam.Question;
import com.examiner.examserver.model.exam.exam;
import com.examiner.examserver.model.exam.subModule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface QuestionRepository extends JpaRepository<Question,Long> {

  Set<Question> findBySubModule(subModule subModule);
}

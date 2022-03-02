package com.examiner.examserver.repo;

import com.examiner.examserver.model.exam.SubQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubQuestionRepository extends JpaRepository<SubQuestion,Long> {
}

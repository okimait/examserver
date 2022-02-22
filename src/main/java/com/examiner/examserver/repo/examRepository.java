package com.examiner.examserver.repo;

import com.examiner.examserver.model.exam.exam;
import com.examiner.examserver.model.program.program;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface examRepository extends JpaRepository<exam,Long> {
    public List<exam> findByActive(Boolean b);

  public Set<exam> findByProgram(program program);
}


package com.examiner.examserver.repo;

import com.examiner.examserver.model.exam.exam;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface examRepository extends JpaRepository<exam,Long> {
    public List<exam> findByActive(Boolean b);

}


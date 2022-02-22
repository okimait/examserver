package com.examiner.examserver.repo;

import com.examiner.examserver.model.exam.exam;
import com.examiner.examserver.model.program.program;
import com.examiner.examserver.model.program.programCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface programRepository extends JpaRepository<program, Long> {
    public List<program> findByProgramCategory(programCategory programCategory);
//    public Set<exam> findByExam(program program);
}

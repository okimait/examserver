package com.examiner.examserver.repo;

import com.examiner.examserver.model.program.programCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface programCategoryRepository extends JpaRepository<programCategory, Long> {
}

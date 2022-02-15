package com.examiner.examserver.repo;

import com.examiner.examserver.model.questionSection.sections;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sectionsRepository extends JpaRepository<sections, Long> {
}

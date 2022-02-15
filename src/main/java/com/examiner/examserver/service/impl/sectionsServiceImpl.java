package com.examiner.examserver.service.impl;

import com.examiner.examserver.model.questionSection.sections;
import com.examiner.examserver.repo.sectionsRepository;
import com.examiner.examserver.service.sectionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
@Service
public class sectionsServiceImpl implements sectionsService {
    @Autowired
    sectionsRepository sectionsRepository;
    @Override
    public sections addSection(sections sections) {
        return this.sectionsRepository.save(sections);
    }

    @Override
    public sections updateSection(sections sections) {
        return this.sectionsRepository.save(sections);
    }

    @Override
    public Set<sections> getQuestionSection() {
        return new LinkedHashSet<>(this.sectionsRepository.findAll());
    }

    @Override
    public sections getQuestionSection(Long sectionId) {
        return this.sectionsRepository.findById(sectionId).get();
    }

    @Override
    public void deleteSection(Long sectionId) {
        sections sections = new sections();
        sections.setSectionId(sectionId);
        this.sectionsRepository.delete(sections);

    }
}

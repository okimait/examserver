package com.examiner.examserver.service;

import com.examiner.examserver.model.questionSection.sections;

import java.util.Set;

public interface sectionsService {
    public sections addSection(sections sections);

    public sections updateSection(sections sections);

    public Set<sections> getQuestionSection();

    public sections getQuestionSection(Long sectionId);

    public void deleteSection(Long sectionId);
}

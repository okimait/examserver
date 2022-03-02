package com.examiner.examserver.service.impl;

import com.examiner.examserver.model.exam.SubQuestion;
import com.examiner.examserver.model.questionSection.sections;
import com.examiner.examserver.repo.SubQuestionRepository;
import com.examiner.examserver.service.SubQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class SubQuestionServiceImpl implements SubQuestionService {
  @Autowired
  private SubQuestionRepository subQuestionRepository;
  @Override
  public SubQuestion addSubQuestion(SubQuestion subQuestion) {
    return subQuestionRepository.save(subQuestion);
  }

  @Override
  public SubQuestion updateSubQuestion(SubQuestion subQuestion) {
    return subQuestionRepository.save(subQuestion);
  }

  @Override
  public Set<SubQuestion> getSubQuestion() {
    return new LinkedHashSet<>(subQuestionRepository.findAll());
  }

  @Override
  public SubQuestion getSubQuestion(Long subQuestionId) {
    return subQuestionRepository.findById(subQuestionId).get();
  }

  @Override
  public void deleteSubQuestion(Long subQuestionId) {
    SubQuestion subQuestion = new SubQuestion();
    subQuestion.setSubQuestionId(subQuestionId);
    this.subQuestionRepository.delete(subQuestion);

  }
}

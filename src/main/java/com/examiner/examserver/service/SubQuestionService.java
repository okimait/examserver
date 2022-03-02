package com.examiner.examserver.service;

import com.examiner.examserver.model.exam.SubQuestion;
import com.examiner.examserver.model.exam.subModule;

import java.util.Set;

public interface SubQuestionService {
  public SubQuestion addSubQuestion (SubQuestion subQuestion);

  public SubQuestion  updateSubQuestion (SubQuestion subQuestion);

  public Set<SubQuestion > getSubQuestion ();

  public SubQuestion  getSubQuestion (Long subQuestionId);

  public void deleteSubQuestion(Long subQuestionId);
}

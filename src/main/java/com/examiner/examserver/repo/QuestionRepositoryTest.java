package com.examiner.examserver.repo;

import com.examiner.examserver.model.exam.Question;
import com.examiner.examserver.model.exam.SubQuestion;
import com.examiner.examserver.model.exam.subModule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class QuestionRepositoryTest {

  @Autowired
  QuestionRepository repository;
  @Test
  public void saveQuestion(){
    subModule subM = subModule.builder()
            .subModuleName("Dodging class")
            .subModuleCode("DG001")
            .subModuleDescription("For those who want to dodge class well")
            .build();
    SubQuestion subQ = SubQuestion.builder()
            .Answer("To sweep")
            .Content("What is the primary role of a broom?")
            .Marks(3)
            .build();
    Question question = Question.builder()
            .subQuestion(subQ)
           // .subModule(subM)
            .mainquestionContent("Why do you dodge class")
            .manquestionAnswer("For pleasure")
            .mainquestionMarks(2)
            .mainquestionStatus(false)
            .build();
    repository.save(question);
    System.out.println("question saved successfully"+ question);
  }

}
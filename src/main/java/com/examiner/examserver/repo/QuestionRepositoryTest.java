package com.examiner.examserver.repo;

import com.examiner.examserver.model.exam.Question;
import com.examiner.examserver.model.exam.SubQuestion;
import com.examiner.examserver.model.exam.subModule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class QuestionRepositoryTest {

  @Autowired
  QuestionRepository repository;

//  public void saveQuestion(){
//    subModule subM = subModule.builder()
//            .subModuleName("Dodging class")
//            .subModuleCode("DG001")
//            .subModuleDescription("For those who want to dodge class well")
//            .build();
//    SubQuestion subQ = SubQuestion.builder()
//            .subQuestionAnswer("To sweep")
//            .subQuestionContent("What is the primary role of a broom?")
//            .subQuestionMarks(3)
//            .build();
//    Question question;
//    question = Question.builder()
//           // .subQuestions(Set.of(subQ))
//           // .subModule(subM)
//            .mainquestionContent("Why do you dodge class")
//            .manquestionAnswer("For pleasure")
//            .mainquestionMarks(2)
//            .mainquestionStatus(false)
//            //.subQuestions(Set.of(subQ))
//            .build();
//    repository.save(question);
//    System.out.println("question saved successfully"+ question);
//  }
//  @Test
//  public void saveQuestionWithSubQuestion(){
//    SubQuestion subQuestion = SubQuestion.builder()
//            .subQuestionAnswer("It will remain the same")
//            .subQuestionContent("What will happen to it?")
//            .subQuestionMarks(3)
//            .build();
//    subModule subM = subModule.builder()
//            .subModuleDescription("for lawyers")
//            .subModuleCode("vcc006")
//            .numberOfQuestions("6")
//            .build();
//    Question question = Question.builder()
//           // .subQuestions(Set.of(subQuestion))
//            //.subModule(subM)
//            .mainquestionStatus(false)
//            .mainquestionMarks(2)
//            .manquestionAnswer("Zero")
//            .mainquestionContent("what is zero?")
//            .build();
//    repository.save(question);
//    System.out.println("question saved "+question);
//  }

}
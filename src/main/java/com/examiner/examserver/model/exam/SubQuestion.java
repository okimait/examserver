package com.examiner.examserver.model.exam;

import com.examiner.examserver.model.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubQuestion {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long subQuestionId;
    private String subQuestionContent;
    private Integer subQuestionMarks;
    private String subQuestionAnswer;

//  @ManyToOne(fetch = FetchType.EAGER)
//  @JoinColumn(name = "question_id", referencedColumnName = "questionId")
//  private Question question;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof SubQuestion)) return false;
    SubQuestion that = (SubQuestion) o;
    return getSubQuestionId().equals(that.getSubQuestionId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getSubQuestionId());
  }
}

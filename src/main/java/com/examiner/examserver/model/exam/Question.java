package com.examiner.examserver.model.exam;

import com.examiner.examserver.model.questionSection.sections;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long questionId;
    @Column(length = 5000)
    private String mainquestionContent;
    private boolean mainquestionStatus = false;
    private Integer mainquestionMarks;
    private String manquestionAnswer;

    @Embedded
    private SubQuestion subQuestion;

    @ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "sub_module_id", referencedColumnName = "subModuleId")
    private subModule subModule;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "section_id", referencedColumnName = "sectionId")
    @JsonBackReference
    private sections sections;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;
        Question question = (Question) o;
        return getQuestionId().equals(question.getQuestionId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuestionId());
    }
}

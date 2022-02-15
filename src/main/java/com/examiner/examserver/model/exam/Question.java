package com.examiner.examserver.model.exam;

import com.examiner.examserver.model.questionSection.sections;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;

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

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "sub_module_id", referencedColumnName = "subModuleId")
    private subModule subModule;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "section_id", referencedColumnName = "sectionId")
    @JsonIgnore
    private sections sections;



}

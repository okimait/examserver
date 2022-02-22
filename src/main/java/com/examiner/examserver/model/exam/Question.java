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
import java.util.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long questionId;
    @Column(length = 5000)
    private String mainquestionContent;
    private boolean mainquestionStatus = false;
    private Integer mainquestionMarks;
    @Column(length = 50000)
    private String manquestionAnswer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sub_module_id", referencedColumnName = "subModuleId")
    private subModule subModule;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "section_id", referencedColumnName = "sectionId")
    private sections sections;

    @Override
    public int hashCode() {
        return Objects.hash(getQuestionId());
    }
}

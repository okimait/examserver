package com.examiner.examserver.model.exam;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "subModule")
public class subModule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long subModuleId;
    private String subModuleName;
    private String subModuleDescription;
    private String numberOfQuestions;
    private String subModuleCode;

    @ManyToOne(fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "exam_id", referencedColumnName = "examId")
    private exam exam;

    @OneToMany(mappedBy = "subModule",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Question> questions = new HashSet<>();

    public subModule() {
    }

    public Long getSubModuleId() {
        return subModuleId;
    }

    public void setSubModuleId(Long subModuleId) {
        this.subModuleId = subModuleId;
    }

    public String getSubModuleName() {
        return subModuleName;
    }

    public void setSubModuleName(String subModuleName) {
        this.subModuleName = subModuleName;
    }

    public String getSubModuleDescription() {
        return subModuleDescription;
    }

    public void setSubModuleDescription(String subModuleDescription) {
        this.subModuleDescription = subModuleDescription;
    }

    public String getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(String numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public String getSubModuleCode() {
        return subModuleCode;
    }

    public void setSubModuleCode(String subModuleCode) {
        this.subModuleCode = subModuleCode;
    }

    public exam getExam() {
        return exam;
    }

    public void setExam(exam exam) {
        this.exam = exam;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof subModule)) return false;
        subModule subModule = (subModule) o;
        return getSubModuleId().equals(subModule.getSubModuleId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSubModuleId());
    }
}

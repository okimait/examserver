package com.examiner.examserver.model.questionSection;

import com.examiner.examserver.model.exam.Question;
import com.examiner.examserver.model.exam.exam;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "sections")
public class sections {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sectionId;
    private String sectionName;
    private int MaximunMarks;
    private String sectionDescription;

    @OneToMany(mappedBy = "sections", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<Question> sectionQuestions;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof sections)) return false;
        sections sections = (sections) o;
        return getSectionId().equals(sections.getSectionId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSectionId());
    }
}

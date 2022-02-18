package com.examiner.examserver.model.exam;

import com.examiner.examserver.model.program.program;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "exam")
public class exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long examId;
    private String  examTitle;
    private String examDescription;
    private String maxMarks;
    private String numberOfQuestions;
    private boolean active = false;
    private String moduleCode;

    @ManyToOne(fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "program_id", referencedColumnName = "programId")
    private program program;

    @OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private Set<subModule> subModules = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof exam)) return false;
        exam exam = (exam) o;
        return getExamId().equals(exam.getExamId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExamId());
    }
}

package com.examiner.examserver.model.exam;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@ToString
@Table(name = "comp_subModule")
public class subModule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long subModuleId;
    private String subModuleName;
    private String subModuleDescription;
    private String subModuleCode;

    @ManyToOne(fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "exam_id", referencedColumnName = "examId")
    private exam exam;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private Set<Question> questions = new LinkedHashSet<>();

}

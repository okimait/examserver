package com.examiner.examserver.model.program;


import com.examiner.examserver.model.exam.exam;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="program" )
public class program {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  private Long programId;
  private String programName;
  private String programCode;
  private String numberOfModules;
  private String programDescription;

  @ManyToOne(fetch = FetchType.EAGER)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JoinColumn(name = "program_category_id", referencedColumnName = "programCategoryId")
  private programCategory programCategory;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private Set<exam> ProgramExams = new LinkedHashSet<>();


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof program)) return false;
    program program = (program) o;
    return getProgramId().equals(program.getProgramId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getProgramId());
  }
}

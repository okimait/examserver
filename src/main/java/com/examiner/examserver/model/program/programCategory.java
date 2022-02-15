package com.examiner.examserver.model.program;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import net.bytebuddy.dynamic.scaffold.MethodGraph;

import javax.persistence.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "programCategory")
public class programCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long programCategoryId;
    private String programCategoryName;
    private String programCategoryDescription;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Set<program> CatetegoryPrograms = new LinkedHashSet<>();

}

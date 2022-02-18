package com.examiner.examserver.model.program;
import lombok.*;
import javax.persistence.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
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
    private Set<program> CategoryProgram = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof programCategory)) return false;
        programCategory that = (programCategory) o;
        return getProgramCategoryId().equals(that.getProgramCategoryId());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getProgramCategoryId());
    }
}

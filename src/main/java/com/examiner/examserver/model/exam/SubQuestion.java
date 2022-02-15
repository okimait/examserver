package com.examiner.examserver.model.exam;

import com.examiner.examserver.model.User;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@AttributeOverrides({
        @AttributeOverride(name = "Content",column = @Column(name = "subquestionContent")),
        @AttributeOverride(name = "Marks", column = @Column(name = "subquestionMarks")),
        @AttributeOverride(name = "Answer", column = @Column(name = "subquestionAnswer"))
        })
public class SubQuestion {
    private String Content;
    private Integer Marks;
    private String Answer;

}

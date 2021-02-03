package lk.ceyentra.quiz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Quections {
    @Id
    private String qid;
    private String qection;
    private String option01;
    private String option02;
    private String option03;
    private String option04;
  //  private int answer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paperID" ,referencedColumnName = "id",nullable = false)
    private Paper paper;


}

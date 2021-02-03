package lk.ceyentra.quiz.dto;

import lk.ceyentra.quiz.entity.Quections;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class paperDto {
    private String id;
    private String name;
    private String type;
    private int numOfQuection;
    private List<Quections> quections;
}

package lk.ceyentra.quiz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Paper {
    @Id
    private String id;
    private String name;
    private String type;
    private int numOfQuection;
//    private String time;

    @OneToMany(mappedBy = "paper",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Quections> quections = new ArrayList<>();

    public Paper(String id, String name, String type, int numOfQuection) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.numOfQuection = numOfQuection;
    }
}

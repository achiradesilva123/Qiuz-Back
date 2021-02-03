package lk.ceyentra.quiz.repo;

import lk.ceyentra.quiz.entity.Paper;
import lk.ceyentra.quiz.entity.Quections;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface quectionRepo extends JpaRepository<Quections , String> {
   // List<Quections> findAllByUseridStartsWith(String letter);
    List<Quections> findAllByQidStartingWith(String letter);
}

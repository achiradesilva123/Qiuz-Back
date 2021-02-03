package lk.ceyentra.quiz.repo;

import lk.ceyentra.quiz.entity.Paper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaperRepo extends JpaRepository<Paper , String> {
   // List<Paper> findAllByPStartsWith(String letter);
   List<Paper> findAllByIdStartingWith(String letter);
}

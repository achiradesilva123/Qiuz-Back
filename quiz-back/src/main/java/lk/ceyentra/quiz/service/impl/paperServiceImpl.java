package lk.ceyentra.quiz.service.impl;

import lk.ceyentra.quiz.dto.paperDto;
import lk.ceyentra.quiz.entity.Paper;
import lk.ceyentra.quiz.entity.Quections;
import lk.ceyentra.quiz.repo.PaperRepo;
import lk.ceyentra.quiz.repo.quectionRepo;
import lk.ceyentra.quiz.service.IdGenerateService;
import lk.ceyentra.quiz.service.PaperService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class paperServiceImpl implements PaperService {
    @Autowired
    quectionRepo repo;
    @Autowired
    ModelMapper mapper;
    @Autowired
    IdGenerateService service;

    @Override
    public void createPaper(paperDto dto) {
      dto.setId(service.genarateId("T"));
      List<Quections> Q=dto.getQuections();
      Paper map = new Paper(dto.getId(),dto.getName(),dto.getType(),dto.getNumOfQuection());
      for ( Quections q: Q){
          q.setQid(service.genarateId("Q"));
          q.setPaper(map);
          repo.save(q);
      }
        System.out.println(dto.getId() + dto.getQuections().toString());

    }
}

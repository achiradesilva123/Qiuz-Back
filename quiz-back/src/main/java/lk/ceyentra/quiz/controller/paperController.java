package lk.ceyentra.quiz.controller;

import lk.ceyentra.quiz.dto.paperDto;
import lk.ceyentra.quiz.service.PaperService;
import lk.ceyentra.quiz.service.impl.paperServiceImpl;
import lk.ceyentra.quiz.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/paper")
@CrossOrigin
public class paperController {
    @Autowired
    PaperService service;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addCustomer(@RequestBody paperDto dto) {
        service.createPaper(dto);
        System.out.println(dto.getQuections().toString());
        StandradResponse response = new StandradResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }
}

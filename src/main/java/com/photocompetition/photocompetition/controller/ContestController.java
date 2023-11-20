package com.photocompetition.photocompetition.controller;

import com.photocompetition.photocompetition.dto.ContestDto;
import com.photocompetition.photocompetition.service.ContestService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 500)
@AllArgsConstructor
@RequestMapping("/contest")
public class ContestController {

    private ContestService contestService;

    @GetMapping("all")
    public ResponseEntity<List<ContestDto>> getALlContests(){
      return new ResponseEntity<>(contestService.fetchAll(),HttpStatus.ACCEPTED);
    }

    @PostMapping("add")
    public void addContest(@RequestBody ContestDto contestDto){
        contestService.save(contestDto);
    }

    @GetMapping("findOne")
    public ResponseEntity<ContestDto> getContestById(@RequestParam(value = "id") int id){
        return new ResponseEntity<>(contestService.fetchContestById(id),HttpStatus.ACCEPTED);
    }
}

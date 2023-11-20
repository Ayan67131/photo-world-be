package com.photocompetition.photocompetition.controller;

import com.photocompetition.photocompetition.dto.PhotoDto;
import com.photocompetition.photocompetition.service.PhotoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("photo")
@CrossOrigin(maxAge = 500)
public class PhotoController {

    private PhotoService photoService;

    @GetMapping("find-one")
    public List<PhotoDto> getPhotosByContest(@RequestParam(value = "id") int id){
        return photoService.fetchPhotosByContestId(id);
    }
}
